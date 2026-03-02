package com.torhov.project.taskmanagementsystem.models.tasks;

import com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums.BugStatus;
import com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums.Priority;
import com.torhov.project.taskmanagementsystem.models.tasks.contracts.enums.Severity;
import com.torhov.project.taskmanagementsystem.models.tasks.contracts.models.Bug;

import java.util.List;

public class BugImpl extends TaskBase implements Bug {

    private Priority priority;
    private Severity severity;
    private BugStatus bugStatus;
    private final List<String> stepsToReproduce;

    /*
    TODO Assignee, list of Comments and list of Change log
     */

    public BugImpl(int id, String title, String description, Priority priority, Severity severity, BugStatus bugStatus, List<String> stepsToReproduce) {
        super(id, title, description);
        this.priority = priority;
        this.severity = severity;
        this.bugStatus = BugStatus.ACTIVE;
        this.stepsToReproduce = stepsToReproduce;
    }

    // TODO
    @Override
    public String getAssignee() {
        return "";
    }

    // TODO
    @Override
    public void addAssignee(int assigneeId) {

    }

    // TODO
    @Override
    public void removeAssignee(int assigneeId) {

    }

    @Override
    public String getPriority() {
        return "";
    }

    @Override
    public void setPriority(Priority priority) {

    }

    @Override
    public String getSeverity() {
        return "";
    }

    @Override
    public void setSeverity(Severity severity) {

    }
}
