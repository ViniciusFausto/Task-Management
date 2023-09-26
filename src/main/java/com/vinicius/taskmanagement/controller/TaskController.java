package com.vinicius.taskmanagement.controller;


import com.vinicius.taskmanagement.application.usecaseimpl.TaskUseCaseImpl;
import com.vinicius.taskmanagement.core.entity.Task;
import com.vinicius.taskmanagement.core.usecase.TaskUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskUseCase taskUseCaseImpl;
    @PostMapping
    public ResponseEntity registerTask(@RequestBody Task data){
        try {
            taskUseCaseImpl.save(data);
            return ResponseEntity.created(URI.create("/publicacao/" + data.getID())).build();
        }catch (Exception ex) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }
}