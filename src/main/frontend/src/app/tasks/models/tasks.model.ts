export class Task {

    public id: Number;
    public name: String;
    public completed: Boolean;
    public dueDate: String;

    constructor(id: number, name: String, completed: Boolean, dueDate: String) {
        this.id = id;
        this.completed = completed;
        this.name = name;
        this.dueDate = dueDate;
    }
} 