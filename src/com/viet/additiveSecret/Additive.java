package com.viet.additiveSecret;

import java.util.List;

/**
 * Calculate if the a give prime number is additive [secret(x + y) = secret(x) + secret(y)]
 * Created by viet on 11/30/16.
 */
public class Additive implements AdditiveIfc{
    private List<Integer> primeList;
    public Additive(List<Integer> primeList){
        this.primeList = primeList;
    }

    private int secret(int i) {
        return i * 2;
    }

    /**
     * check whether an input to the secret function is additive or not
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
