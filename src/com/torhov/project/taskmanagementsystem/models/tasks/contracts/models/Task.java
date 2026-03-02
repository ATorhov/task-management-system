package com.torhov.project.taskmanagementsystem.models.tasks.contracts.models;

import com.torhov.project.taskmanagementsystem.models.tasks.contracts.*;

public interface Task extends Assignable, Commentable, Loggable, Unassignable {

    int getId();
    String getTitle();
    String getDescription();

}
