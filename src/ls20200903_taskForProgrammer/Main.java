package ls20200903_taskForProgrammer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(1, Status.READY, "xxxxx", Priority.HIGH);
        Task task2 = new Task(2, Status.PENDING, "zzzzz", Priority.LOW);
        Task task3 = new Task(3, Status.NOTACCEPTED, "yyyyy", Priority.HIGH);
        Task task4 = new Task(4, Status.READY, "uuuuu");
        Task task5 = new Task(5, Status.NOTACCEPTED, "wwwww", Priority.NORMAL);

        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);

        System.out.println(TaskHandler.taskQueue(tasks));


    }
}
