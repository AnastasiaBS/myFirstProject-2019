package lesson19.practice;

import java.util.LinkedList;

public class TasksStorageImpl implements TasksStorage {
    private LinkedList<Task> tasks = new LinkedList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if (tasks.size() != 0) {
            return tasks.removeFirst();
        }
        return null;
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
