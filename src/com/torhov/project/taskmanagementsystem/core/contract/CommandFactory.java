package com.torhov.project.taskmanagementsystem.core.contract;

import com.torhov.project.taskmanagementsystem.commands.contract.Command;

public interface CommandFactory {

    Command createCommandFromCommandName(String commandName, TaskManagementRepository repository);

}
