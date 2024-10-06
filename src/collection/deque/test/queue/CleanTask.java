package collection.deque.test.queue;

public class CleanTask implements Task {
    @Override
    public void execute() {
        System.out.println("Clean up the resources not using...");
    }
}
