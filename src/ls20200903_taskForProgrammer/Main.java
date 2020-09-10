package ls20200903_taskForProgrammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(1, Status.READY, "xxxxx", Priority.HIGH);
        Task task2 = new Task(2, Status.PENDING, "zzzzz", Priority.HIGH);
        Task task3 = new Task(3, Status.NOTACCEPTED, "yyyyy", Priority.NORMAL);
        Task task4 = new Task(4, Status.READY, "uuuuu");
        Task task5 = new Task(5, Status.NOTACCEPTED, "wwwww", Priority.NORMAL);
        Task task6 = new Task(6, Status.NOTACCEPTED, "ppppp", Priority.LOW);
        Task task7 = new Task(7, Status.NOTACCEPTED, "vvvvv", Priority.HIGH);

        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);
        tasks.add(task7);

        Queue<Task> queue = TaskHandler.taskQueue(tasks);
        System.out.println(queue);

        Task iTask = queue.poll();
        while (iTask != null) {
            System.out.print(iTask);
            iTask = queue.poll();
        }
        //System.out.println(queue);

    }
}
