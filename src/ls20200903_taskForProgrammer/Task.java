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
                Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, description);
    }

    @Override
    public int compareTo(Task o) {
        return 0;
    }
}
