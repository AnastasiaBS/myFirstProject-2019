package lesson19.practice;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean stop = false;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        while (!stop) {
            Task task = storage.get();
            if (task != null) {
                System.out.println(Thread.currentThread().getName() + "---------------------" + " взял задачу: " + task);
                System.out.println(Thread.currentThread().getName() + "---------------------" + " начал выполнение задачи: " + task);
                try {
                    task.execute();
                    System.out.println(Thread.currentThread().getName() + "---------------------" + " успешно выполнил задачу: " + task);
                } catch (TaskExecutionFailedException e) {
                    System.out.println(Thread.currentThread().getName() + "---------------------" + " не получилось выполнить задачу: " + task);
                    if (task.getTryCount() < 5) {
                        System.out.println(Thread.currentThread().getName() + "---------------------" + " возвращаю задачу в хранилище: " + task);
                        task.incTryCount();
                        storage.add(task);
                    } else {
                        System.out.println(Thread.currentThread().getName() + "---------------------" + " удалил задачу, т.к. её невозможно выполнить: " + task);
                    }
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "---------------------" + " завершаю работу!!!");
                stop = true;
            }
        }
    }
}
