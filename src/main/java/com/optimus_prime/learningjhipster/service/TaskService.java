package com.optimus_prime.learningjhipster.service;

import com.optimus_prime.learningjhipster.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
