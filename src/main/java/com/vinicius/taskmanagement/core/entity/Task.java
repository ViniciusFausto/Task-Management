package com.vinicius.taskmanagement.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

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

    @NotNull
    private String title;

    private String description;

    @NotNull
    private LocalDateTime creation_date;

    @NotNull
    private String status;

    @NotNull
    private String priority;

    private String assignee;

    private String notes;

    private LocalDateTime completion_date;
}
