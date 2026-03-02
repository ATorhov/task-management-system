package com.torhov.project.taskmanagementsystem.commands;

import com.torhov.project.taskmanagementsystem.commands.contract.Command;
import com.torhov.project.taskmanagementsystem.core.contract.TaskManagementRepository;

import java.util.List;

public class CreateBugCommand implements Command {

    private final TaskManagementRepository taskManagementRepository;

    public CreateBugCommand(TaskManagementRepository taskManagementRepository){
        this.taskManagementRepository = taskManagementRepository;
    }

    @Override
    public String execute(List<String> params) {
        return "";
    }
}
