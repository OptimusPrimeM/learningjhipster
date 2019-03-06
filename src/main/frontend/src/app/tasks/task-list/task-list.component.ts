import { Task } from './../models/tasks.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {

  tasks: Task[] = [];


  ngOnInit() {
    this.tasks.push(new Task(1, "Taks 1 ", true, "01-05-2016"));
    this.tasks.push(new Task(2, "Taks 2 ", true, "01-04-2016"));
    this.tasks.push(new Task(3, "Taks 3 ", false, "22-05-2016"));
    this.tasks.push(new Task(4, "Taks 4 ", true, "01-05-2018"));
    this.tasks.push(new Task(5, "Taks 5 ", false, "01--2016"));
  }

  onTaskChange(event, task){
    console.log("Task has changed!");
  }

  getDueDateLabel(task){
      return task.completed ? 'badge-pill badge-primary' :'badge-pill ';
  }

}
