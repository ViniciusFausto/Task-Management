package com.vinicius.taskmanagement.controller;


import com.vinicius.taskmanagement.core.entity.Task;
import com.vinicius.taskmanagement.core.usecase.TaskUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
public class TaskController {

    private final TaskUseCase taskUseCase;

    @PostMapping
    public ResponseEntity registerTask(@Valid @RequestBody Task data){
            taskUseCase.save(data);
            return ResponseEntity.status(201).body(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity getTaskById(@Valid @PathVariable Integer id){

        Optional<Task> task = taskUseCase.findById(id);
        if(task.isPresent()) {
            return ResponseEntity.ok(task.get());
        }
        return ResponseEntity.notFound().build();
    }
}
