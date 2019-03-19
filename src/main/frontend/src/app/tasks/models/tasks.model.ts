export class Task {

    public id: Number;
    public name: String;
    public completed: Boolean;
    public dueDate: String;

    constructor(name: String, completed: Boolean, dueDate: String) {
        this.completed = completed;
        this.name = name;
        this.dueDate = dueDate;
    }
} 
