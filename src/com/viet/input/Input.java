package com.viet.input;

import com.viet.exception.GeneralException;
import com.viet.validation.AdditiveValidation;

import java.util.Scanner;

/**
 * Get the user input from command line
 * Created by Viet on 11/30/16.
 */
public class Input {

    /**
     * Get the user input from command line and validate it
     * @return
     * @throws GeneralException
     */
    public int getInput() throws GeneralException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean hasNextInt = scanner.hasNextInt();
        int input;
        if(hasNextInt){
            input = scanner.nextInt();
            AdditiveValidation.validateInput(input);
            scanner.close();
        } else {
            throw new GeneralException("Input must be positive integer. Please try again!");
        }
        return input;
    }
}
