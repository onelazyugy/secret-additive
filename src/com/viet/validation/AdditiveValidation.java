package com.viet.validation;

import com.viet.exception.GeneralException;

/**
 * A general validate
 * Created by Viet on 11/30/16.
 */
public class AdditiveValidation {
    /**
     * Validate the input from user. If the input is less than 1, the throw an exception
     * @param input
     * @throws GeneralException
     */
    public static void validateInput(int input) throws GeneralException{
        if(input < 1){
            throw new GeneralException("input must be positive integer");
        }
    }
}
