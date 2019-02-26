package com.optimus_prime.learningjhipster.service;

import com.optimus_prime.learningjhipster.domain.Task;
import com.optimus_prime.learningjhipster.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return taskRepository.findAll();
    }
}
