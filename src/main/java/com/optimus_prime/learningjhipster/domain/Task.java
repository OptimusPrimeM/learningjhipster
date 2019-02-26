package com.optimus_prime.learningjhipster.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue()
    private Long id;
    private String name;
    private LocalDate dueDate;
    private Boolean completed;

}
