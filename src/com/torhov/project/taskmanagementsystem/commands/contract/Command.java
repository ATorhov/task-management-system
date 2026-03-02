package com.torhov.project.taskmanagementsystem.commands.contract;

import java.util.List;

public interface Command {

    String execute(List<String> params);

}
