package com.viet;

import com.viet.additiveSecret.AdditiveFunction;
import com.viet.additiveSecret.Function;
import com.viet.exception.GeneralException;
import com.viet.input.Input;
import com.viet.util.NumberUtils;

import java.util.List;

/**
 * Take a user input, build a list of prime number less than the input then determine the additive from list of prime number.
 * Created by Viet on 11/30/16.
 */
public class AdditiveClient {
    public static void main(String[] args) {
        try{
            Input input = new Input();
            int n = input.getInput();
            List<Integer> primeNumbers = NumberUtils.getPrimeLessThanInput(n);
            System.out.println("prime numbers are: " + primeNumbers.toString());
            Function additive = new AdditiveFunction(primeNumbers);
            boolean isSecretAdditive = additive.isAdditive();
            System.out.println("is secret additive? " + isSecretAdditive);
        }catch (GeneralException ge){
            System.out.println(ge.getMessage());
        }
    }
}
