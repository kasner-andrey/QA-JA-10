package com.academy.Lesson10Error.HomeWorksError;

public class IllegalTimeException extends RuntimeException{
    private String message;

    public IllegalTimeException() {
    }

    public IllegalTimeException(String message) {
        this.message = message;
    }

    public String toString(){
        return message;
    }

}
