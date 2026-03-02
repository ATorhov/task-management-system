package com.torhov.project.taskmanagementsystem.core;

import com.torhov.project.taskmanagementsystem.commands.CreateBugCommand;
import com.torhov.project.taskmanagementsystem.commands.contract.Command;
import com.torhov.project.taskmanagementsystem.commands.enums.CommandType;
import com.torhov.project.taskmanagementsystem.core.contract.CommandFactory;
import com.torhov.project.taskmanagementsystem.core.contract.TaskManagementRepository;

public class CommandFactoryImpl implements CommandFactory {

    private static final String COMMAND_NOT_SUPPORTED_MESSAGE = "Command %s is not supported.";

    @Override
    public Command createCommandFromCommandName(String commandName, TaskManagementRepository repository) {

        CommandType commandType = tryParseCommandType(commandName);

        return switch (commandType){
            case CREATEBUG -> new CreateBugCommand(repository);
        };

    }

    private CommandType tryParseCommandType(String value){
        try {
            return CommandType.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(String.format(COMMAND_NOT_SUPPORTED_MESSAGE));
        }
    }

}
