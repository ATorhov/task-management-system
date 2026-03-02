package com.torhov.project.taskmanagementsystem.core;

import com.torhov.project.taskmanagementsystem.commands.contract.Command;
import com.torhov.project.taskmanagementsystem.core.contract.CommandFactory;
import com.torhov.project.taskmanagementsystem.core.contract.Engine;
import com.torhov.project.taskmanagementsystem.core.contract.TaskManagementRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagementEngineImpl implements Engine {

    private static final String TERMINATION_COMMAND = "Exit",
                                EMPTY_COMMAND = "Command cannot be empty",
                                MAIN_SPLIT_SYMBOL = " ";

    private final TaskManagementRepository taskManagementRepository;
    private final CommandFactory commandFactory;

    public TaskManagementEngineImpl(){
        this.taskManagementRepository = new TaskManagementRepositoryImpl();
        this.commandFactory = new CommandFactoryImpl();
    }

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                String input = scanner.nextLine();
                if (input.isBlank()){
                    System.out.println(EMPTY_COMMAND);
                    continue;
                }
                if (input.equalsIgnoreCase(TERMINATION_COMMAND)) {
                    break;
                }
                processCommand(input);
            } catch (Exception ex) {
                if (ex.getMessage() != null && !ex.getMessage().isEmpty()){
                    System.out.println(ex.getMessage());
                } else {
                    System.out.println(ex.toString());
                }
            }
        }
    }

    private void processCommand(String input) {
        String commandName = extractCommandName(input);
        Command command = commandFactory.createCommandFromCommandName(commandName, taskManagementRepository);
        List<String> parameters = extractCommandParameters(input);
        String commandResult = command.execute(parameters);
        System.out.println(commandResult);
    }

    private String extractCommandName(String input){
        return input.split(MAIN_SPLIT_SYMBOL)[0];
    }

    private List<String> extractCommandParameters(String input){
        String[] commandParts = input.split(MAIN_SPLIT_SYMBOL);
        ArrayList<String> parameters = new ArrayList<>();
        for (int i = 1; i < commandParts.length; i++) {
            parameters.add(commandParts[i]);
        }
        return parameters;
    }
}
