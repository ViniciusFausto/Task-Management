package com.vinicius.taskmanagement.core.usecase;

import com.vinicius.taskmanagement.core.entity.Task;
import com.vinicius.taskmanagement.infraestructure.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface TaskUseCase {
    public void save(Task task);
}
