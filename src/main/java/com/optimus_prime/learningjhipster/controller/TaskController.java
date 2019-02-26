package com.optimus_prime.learningjhipster.controller;

import com.optimus_prime.learningjhipster.domain.Task;
import com.optimus_prime.learningjhipster.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tasks")
public class TaskController {

    private TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping({"", "/"})
    public Iterable<Task> list() {
        return taskService.list();
    }

}
