package com.vinicius.taskmanagement.application.usecaseimpl;

import com.vinicius.taskmanagement.core.entity.Task;
import com.vinicius.taskmanagement.core.usecase.TaskUseCase;
import com.vinicius.taskmanagement.infraestructure.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskUseCaseImpl implements TaskUseCase {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public void save(Task task) {
        taskRepository.save(task);
    }
}
