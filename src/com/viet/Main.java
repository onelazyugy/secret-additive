package com.viet;

import com.viet.additiveSecret.Additive;
import com.viet.additiveSecret.AdditiveIfc;
import com.viet.input.Input;
import com.viet.util.NumberUtils;

import java.util.List;

/**
 * Take a user input, build a list of prime number less than the input then determine the additive from list of prime number.
 */
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        int n = input.getInput();
        List<Integer> primeNumbers = NumberUtils.getPrimeLessThanInput(n);
        System.out.println("prime numbers are: " + primeNumbers.toString());
        AdditiveIfc additive = new Additive(primeNumbers);
        boolean isSecretAdditive = additive.isAdditive();
        System.out.println("is secret additive? " + isSecretAdditive);
    }
}
