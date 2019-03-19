import { Injectable, EventEmitter } from '@angular/core';
import { Http } from '@angular/http';
import { catchError, map, retry } from 'rxjs/operators';
import { Task } from '../models/tasks.model';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  onTaskAdd = new EventEmitter<Task>();

  constructor(private http: Http) { }

  getTasks() {
    return this.http.get('api/tasks')
      .pipe(
        map(response => response.json())
      );
  }


  saveTask(task: Task, checked: boolean) {

    task.completed = checked;

    console.log(task);

    return this.http.post('api/tasks/save', task)
      .pipe(
        map(response => response.json())
      );
  }

  addTask(task: Task) {

    console.log(task);

    return this.http.post('api/tasks/save', task)
      .pipe(
        map(response => response.json())
      );
  }




}
