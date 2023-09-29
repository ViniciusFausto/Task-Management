package com.vinicius.taskmanagement.core.usecase;

import com.vinicius.taskmanagement.core.entity.Task;

import java.util.Optional;

public interface TaskUseCase {
    void save(Task task);

    Optional<Task> findById(Integer id);
}
