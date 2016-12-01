package com.viet.util;

import com.viet.exception.GeneralException;

import java.util.ArrayList;
import java.util.List;

/**
 * A utility class with few helper methods
 * Created by Viet on 11/30/16.
 */
public class NumberUtils {
    /**
     * Given an input, find all of the prime numbers that are less than the input.
     * @param input
     * @return a list of prime numbers that are less than the input
     */
    public static List<Integer> getPrimeLessThanInput(int input){
        List<Integer> primeList = new ArrayList<>();
        for(int i = 2; i <= input; i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                primeList.add(i);
            }
        }
        return primeList;
    }

    /**
     * Given a number, determine if it is prime or not
     * @param n
     * @return true if the given number is prime, false otherwise
     */
    private static boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n) + 1;
        for(int i = 2; i < sqrt; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
