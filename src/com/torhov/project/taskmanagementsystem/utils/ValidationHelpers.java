package com.torhov.project.taskmanagementsystem.utils;

public class ValidationHelpers {

    public static void validateIntRange(int minLength, int maxLength, int actualLength, String errorMessage){
        if (actualLength < minLength || actualLength > maxLength){
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public static void validateStringLength(String stringToValidate, int minLength, int maxLength, String errorMessage){
        validateIntRange(minLength, maxLength, stringToValidate.length(), errorMessage);
    }

}
