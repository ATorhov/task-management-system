package com.torhov.project.taskmanagementsystem.models.tasks;

import com.torhov.project.taskmanagementsystem.models.tasks.contracts.Assignable;
import com.torhov.project.taskmanagementsystem.models.tasks.contracts.Unassignable;
import com.torhov.project.taskmanagementsystem.models.tasks.contracts.models.Task;
import com.torhov.project.taskmanagementsystem.utils.ValidationHelpers;

public abstract class TaskBase implements Task {

    public static final int TASK_TITLE_MIN_LENGTH = 10,
                            TASK_TITLE_MAX_LENGTH = 500,
                            TASK_DESCRIPTION_MIN_LENGTH = 10,
                            TASK_DESCRIPTION_MAX_LENGTH = 500;

    private static final String TITLE_ERROR_MESSAGE = "Title cannot be less than %d or more than %d symbols",
                                DESCRIPTION_ERROR_MESSAGE = "Description cannot be less than %d or more than %d symbols",
                                USER_ASSIGNED_MESSAGE = "User '%s' has already been assigned to other task, and cannot be re-assigned at the moment.",
                                TASK_ASSIGNED_MESSAGE = "This task has already been assigned to other user, therefore cannot be re-assign to '%s'",
                                USER_UNASSIGNED_MESSAGE = "This user hasn't been assigned to the task ID:%d, therefore cannot be unassigned from it",
                                TASK_UNASSIGNED_MESSAGE = "This task ID:%d hasn't been assigned to any user";



    private int id;
    private String title;
    private String description;

    public TaskBase(int id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle(){
        return title;
    }

    protected void validateTitle(String title){
        ValidationHelpers.validateStringLength(title,
                TASK_TITLE_MIN_LENGTH,
                TASK_TITLE_MAX_LENGTH,
                String.format(TITLE_ERROR_MESSAGE,
                        TASK_TITLE_MIN_LENGTH,
                        TASK_TITLE_MAX_LENGTH));
    }

    private void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    @Override
    public String getDescription(){
        return description;
    }

    protected void validateDescription(String description){
        ValidationHelpers.validateStringLength(description,
                TASK_DESCRIPTION_MIN_LENGTH,
                TASK_DESCRIPTION_MAX_LENGTH,
                String.format(DESCRIPTION_ERROR_MESSAGE,
                        TASK_DESCRIPTION_MIN_LENGTH,
                        TASK_DESCRIPTION_MAX_LENGTH));
    }

    private void setDescription(String description) {
        validateDescription(description);
        this.description = description;
    }
}
