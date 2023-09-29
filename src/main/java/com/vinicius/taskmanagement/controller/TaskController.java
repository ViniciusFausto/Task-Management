package com.vinicius.taskmanagement.controller;


import com.vinicius.taskmanagement.application.usecaseimpl.TaskUseCaseImpl;
import com.vinicius.taskmanagement.core.entity.Task;
import com.vinicius.taskmanagement.core.usecase.TaskUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskUseCase taskUseCaseImpl;
    @PostMapping
    public ResponseEntity registerTask(@Valid @RequestBody Task data){
            taskUseCaseImpl.save(data);
            return ResponseEntity.status(201).body(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity getTaskById(@Valid @PathVariable Integer id){

        Optional<Task> task = taskUseCaseImpl.findById(id);
        if(task.isPresent()) {
            return ResponseEntity.ok(task.get());
        }
        return ResponseEntity.notFound().build();
    }
}
