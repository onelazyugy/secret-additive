package com.viet.input;

import com.viet.util.NumberUtils;

import java.util.Scanner;

/**
 * Created by viet on 11/30/16.
 */
public class Input {
    public int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        //check for number or not

        scanner.close();
        return input;
    }
}
