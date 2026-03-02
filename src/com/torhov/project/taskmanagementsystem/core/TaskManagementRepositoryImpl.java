package com.torhov.project.taskmanagementsystem.core;

import com.torhov.project.taskmanagementsystem.core.contract.TaskManagementRepository;
import com.torhov.project.taskmanagementsystem.models.tasks.contracts.models.Bug;

import java.util.ArrayList;
import java.util.List;

public class TaskManagementRepositoryImpl implements TaskManagementRepository {

    private final List<Bug> bugs;
    private int nextId;

    public TaskManagementRepositoryImpl() {
        this.nextId = 0;
        this.bugs = new ArrayList<>();
    }
}
