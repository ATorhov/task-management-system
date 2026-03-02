package com.torhov.project.taskmanagementsystem.models.tasks.contracts;


import com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums.Priority;

// for bug and story, not for feedback
public interface Prioritizable {

    void setPriority(Priority priority);
    public String getPriority();


}
