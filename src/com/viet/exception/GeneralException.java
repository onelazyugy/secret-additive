package com.viet.exception;

/**
 * A general exception
 * Created by Viet on 11/30/16.
 */
public class GeneralException extends Exception{
    private String message;
    public GeneralException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GeneralException{" +
                "message='" + message + '\'' +
                '}';
    }
}
