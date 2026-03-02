package com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums;

public enum Priority {

    HIGH,
    MEDIUM,
    LOW;

    @Override
    public String toString(){
        return switch (this){
            case HIGH -> "High";
            case MEDIUM -> "Medium";
            case LOW -> "Low";
        };
    }
}
