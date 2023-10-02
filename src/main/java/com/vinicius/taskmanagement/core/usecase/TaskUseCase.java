package com.vinicius.taskmanagement.core.usecase;

import com.vinicius.taskmanagement.core.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskUseCase {
    void save(Task task);

    Optional<Task> findById(Integer id);

    List<Task> findAll();

    Task update(Integer id, Task task);

    void remove(Integer id) throws Exception;

}
