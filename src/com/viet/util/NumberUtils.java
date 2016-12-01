package com.viet.util;

import com.viet.exception.AdditiveException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by viet on 11/30/16.
 */
public class NumberUtils {
    public static List<Integer> getPrimeLessThanInput(int input){
        List<Integer> primeList = new ArrayList<>();
        for(int i = 2; i < input; i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n) + 1;
        for(int i = 2; i < sqrt; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isNumeric(int n) throws AdditiveException{
        return true;
    }
}
