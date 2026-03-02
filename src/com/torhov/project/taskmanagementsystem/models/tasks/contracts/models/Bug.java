package com.torhov.project.taskmanagementsystem.models.tasks.contracts.models;

import com.torhov.project.taskmanagementsystem.models.tasks.contracts.Prioritizable;
import com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums.Severity;

public interface Bug extends Prioritizable {

    String getSeverity();
    void setSeverity(Severity severity);


}
