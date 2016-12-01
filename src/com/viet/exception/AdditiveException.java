package com.viet.exception;

/**
 * Created by viet on 11/30/16.
 */
public class AdditiveException extends Exception{
    private String message;
    public AdditiveException(String message){
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
        return "AdditiveException{" +
                "message='" + message + '\'' +
                '}';
    }
}
