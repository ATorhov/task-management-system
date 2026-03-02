package com.torhov.project.taskmanagementsystem.models.tasks.contracts;

public interface Assignable {

    String getAssignee();
    void addAssignee(int assigneeId);
    boolean getIsAssigned();
    void setAssigned(boolean isAssigned);

}
