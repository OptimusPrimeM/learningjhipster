import { TaskService } from './../services/task.service';
import { Task } from './../models/tasks.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {

  tasks: Task[] = [];

  constructor(private taskService: TaskService) { }


  ngOnInit() {
    this.taskService.getTasks()
      .subscribe(
        (tasks: any[]) => {
          this.tasks = tasks;
        },
        (error) => {
          console.log(error);
        }
      );

    this.taskService.onTaskAdd.subscribe(
      (task: Task) => {
        this.tasks.push(task);
      }
    )
  }

  onTaskChange(event, task) {
    this.taskService.saveTask(task, event.target.checked)
      .subscribe();
  }

  getDueDateLabel(task) {
    return task.completed ? 'badge-pill badge-primary' : 'badge-pill ';
  }

}
