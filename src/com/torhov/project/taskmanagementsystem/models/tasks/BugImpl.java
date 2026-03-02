package com.torhov.project.taskmanagementsystem.models.tasks;

public class BugImpl extends TaskBase{



    public BugImpl(int id, String title, String description) {
        super(id, title, description);
    }

    @Override
    public String getAssignee() {
        return "";
    }

    @Override
    public void addAssignee(int assigneeId) {

    }

    @Override
    public boolean getIsAssigned() {
        return false;
    }

    @Override
    public void setAssigned(boolean isAssigned) {

    }

    @Override
    public void unassign(int assigneeId) {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void changePriority() {

    }

    @Override
    public String getPriority() {
        return "";
    }
}
