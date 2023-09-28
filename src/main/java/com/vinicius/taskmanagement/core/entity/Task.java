package com.vinicius.taskmanagement.core.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


import java.time.LocalDateTime;

@Table(name = "task")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "ID")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @NotBlank(message="Title field cannot be null or empty")
    private String title;

    private String description;

    @NotNull(message="Creation date field cannot be null")
    private LocalDateTime creation_date;

    @NotBlank(message="Status field cannot be null or empty")
    private String status;

    @NotBlank(message="priority field cannot be null or empty")
    private String priority;

    private String assignee;

    private String notes;

    private LocalDateTime completion_date;
}
