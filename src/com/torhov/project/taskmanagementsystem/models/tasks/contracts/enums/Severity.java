package com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums;

public enum Severity {

    CRITICAL,
    MAJOR,
    MINOR;

    @Override
    public String toString(){
        return switch (this){
            case MAJOR -> "Major";
            case CRITICAL -> "Critical";
            case MINOR -> "Minor";
        };
    }

}
