package com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums;

import com.torhov.project.taskmanagementsystem.models.tasks.contracts.models.Status;

public enum BugStatus implements Status {
    ACTIVE,
    FIXED;

    @Override
    public String toString(){
        return switch (this){
            case ACTIVE -> "Active";
            case FIXED -> "Fixed";
        };
    }
}
