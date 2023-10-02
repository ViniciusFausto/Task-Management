package com.vinicius.taskmanagement.application.usecaseimpl;

import com.vinicius.taskmanagement.core.entity.Task;
import com.vinicius.taskmanagement.core.usecase.TaskUseCase;
import com.vinicius.taskmanagement.infraestructure.repository.TaskRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskUseCaseImpl implements TaskUseCase {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public void save(Task task) {
        taskRepository.save(task);
    }

    @Override
    public Optional<Task> findById(Integer id) {
        return taskRepository.findById(id);
    }
    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task update(Integer id, Task task) {
        Task taskSaved;
        try {
            taskSaved  = taskExistValidation(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        BeanUtils.copyProperties(task, taskSaved, "ID");
        return taskRepository.save(taskSaved);
    }

    @Override
    public void remove(Integer id)  {
        taskRepository.deleteById(id);
    }

    public Task taskExistValidation(Integer id)throws Exception {
        Optional
                .ofNullable(id)
                .orElseThrow(() -> new Exception() );

        return taskRepository.findById(id)
                .orElseThrow( () -> new Exception());
    }
}
