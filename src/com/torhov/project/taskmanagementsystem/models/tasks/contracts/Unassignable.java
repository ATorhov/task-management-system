package com.torhov.project.taskmanagementsystem.models.tasks.contracts;

import com.torhov.project.taskmanagementsystem.models.tasks.TaskBase;

public interface Unassignable {

    void removeAssignee(int assigneeId);

}
