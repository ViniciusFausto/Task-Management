package com.vinicius.taskmanagement.controller;


import com.vinicius.taskmanagement.core.entity.Task;
import com.vinicius.taskmanagement.core.usecase.TaskUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
public class TaskController {
    private final TaskUseCase taskUseCase;

    @PostMapping
    public ResponseEntity<Task> registerTask(@Valid @RequestBody Task data){
        taskUseCase.save(data);
        return ResponseEntity.status(201).body(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Integer id){
        Optional<Task> task = taskUseCase.findById(id);
        if(task.isPresent()) {
            return ResponseEntity.ok(task.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public List<Task> getAll(){
        return taskUseCase.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable Integer id, @Valid @RequestBody Task task) {
        Task taskSaved = taskUseCase.update(id, task);
        return ResponseEntity.ok(taskSaved);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity remove(@PathVariable("id") Integer id) {
        try {
            taskUseCase.remove(id);
            return ResponseEntity.ok(null);
        }catch (Exception ex) {
            return ResponseEntity.noContent().build();
        }
    }
}
