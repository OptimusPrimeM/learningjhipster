import { TaskService } from './../services/task.service';
import { Task } from './../models/tasks.model';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-task-add',
  templateUrl: './task-add.component.html',
  styleUrls: ['./task-add.component.css']
})
export class TaskAddComponent implements OnInit {

  addTaskValue: string = null;

  constructor(public taskService: TaskService) { }

  ngOnInit() {
  }

  onTaskAdd(event) {
    const task: Task = new Task(event.target.value, false, '2019/12/21');
    this.taskService.addTask(task)
      .subscribe(
        (newTask: Task) => {
          this.addTaskValue = ' ';
          this.taskService.onTaskAdd.emit(newTask);
        }
      );
  }

}
