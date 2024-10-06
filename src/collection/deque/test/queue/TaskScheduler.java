package collection.deque.test.queue;

import java.util.ArrayDeque;

public class TaskScheduler {
    private ArrayDeque<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        Task task = tasks.poll();

        if (task != null) {
            task.execute();
        }
    }
}
