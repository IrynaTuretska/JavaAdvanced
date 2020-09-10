package ls20200903_taskForProgrammer;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private int id;
    private Status status;
    private String description;
    private Priority priority;

    public Task(int id, Status status, String description) {
        this(id, status, description, Priority.LOW);
//        this.id = id;
//        this.status = status;
//        this.description = description;
//        this.priority = Priority.LOW;
    }

    public Task(int id, Status status, String description, Priority priority) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\nid: " + id + ", status: " + status +
                ", description: " + description + ", priority: " + priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                status == task.status &&
                Objects.equals(description, task.description) &&
                priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, description, priority);
    }

//    public int numberForPriority(Priority priority) {
//        return priority.numberForPriority();
//    }
//        if (priority.equals(Priority.HIGH)) { //перенесли в класс Priority
//            return 3;
//        } else if (priority.equals(Priority.NORMAL)) {
//            return 2;
//        } else
//            return 1;
//    }

    @Override
    public int compareTo(Task o) {
        return this.priority.compareTo(o.priority);

        //return (numberForPriority(this.priority) - numberForPriority(o.priority));
    }
}
