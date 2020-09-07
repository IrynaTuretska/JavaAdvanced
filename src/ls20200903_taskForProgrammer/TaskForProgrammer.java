package ls20200903_taskForProgrammer;

import java.util.Objects;

public class TaskForProgrammer {
    Task task;
    Programmer programmer;

    public TaskForProgrammer(Task task, Programmer programmer) {
        this.task = task;
        this.programmer = programmer;
    }

    public Task getTask() {
        return task;
    }

    public Programmer getProgrammer() {
        return programmer;
    }

    @Override
    public String toString() {
        return "\ntask: " + task + ", programmer: " + programmer.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskForProgrammer that = (TaskForProgrammer) o;
        return Objects.equals(task, that.task) &&
                Objects.equals(programmer, that.programmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, programmer);
    }
}
