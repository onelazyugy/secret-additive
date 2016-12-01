package com.viet.additiveSecret;

import java.util.List;

/**
 * Calculate if the a give prime number is additive [secret(x + y) = secret(x) + secret(y)]
 * Created by Viet on 11/30/16.
 */
public class AdditiveFunction implements Function {
    private List<Integer> primeList;

    public AdditiveFunction(List<Integer> primeList){
        this.primeList = primeList;
    }

    /**
     * A helper method to help determine if the given parameter is additive
     * @param i
     * @return the parameter time 2
     */
    private int secret(int i) {
        return i * 2;
    }

    /**
     * Check whether an input to the secret function is additive or not based on [secret(x + y) = secret(x) + secret(y)]
     * @return true if it is additive else false
     */
    @Override
    public boolean isAdditive(){
        for (int x : this.primeList) {
            for(int y : this.primeList){
                int rightSideResult = this.secret(x) + this.secret(y);
                int leftSideResult = this.secret(x + y);
                if(rightSideResult == leftSideResult){
                    return true;
                }
            }
        }
        return false;
    }
}
