package lesson19.practice;

import lesson19.CopyWithJava7Utils;
import lesson19.FileChanelCopyUtilsImpl;
import lesson19.FileCopyUtilsImpl;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl();
        task1.setFrom("/D:/Text.txt");
        task1.setTo("/D:/Text_copy.txt");
        task1.setFileCopyUtils(new CopyWithJava7Utils());

        CopyFileTaskImpl task2 = new CopyFileTaskImpl();
        task2.setFrom("/D:/Музыка/Клипы/Rita Ora.mp4");
        task2.setTo("/D:/Копии/Rita Ora_copy.mp4");
        task2.setFileCopyUtils(new FileChanelCopyUtilsImpl());

        CopyFileTaskImpl task3 = new CopyFileTaskImpl();
        task3.setFrom("/D:/Музыка/Клипы/НЮША.mp4");
        task3.setTo("/D:/Копии/НЮША_copy.mp4");
        task3.setFileCopyUtils(new FileCopyUtilsImpl());

        CopyFileTaskImpl task4 = new CopyFileTaskImpl();
        task4.setFrom("/D:/Музыка/Клипы/Сергей Лазарев.mp4");
        task4.setTo("/D:/Копии/Сергей Лазарев_copy.mp4");
        task4.setFileCopyUtils(new CopyWithJava7Utils());

        FindFilesTaskImpl task5 = new FindFilesTaskImpl("D://", "Java");
        task5.setPrintStream(System.out);
        FindFilesTaskImpl task6 = new FindFilesTaskImpl("D://", "Text");
        task6.setPrintStream(System.out);
        FindFilesTaskImpl task7 = new FindFilesTaskImpl("D://", "Разное");
        task7.setPrintStream(System.out);
        FindFilesTaskImpl task8 = new FindFilesTaskImpl("/D:/Музыка/Клипы", "Сергей Лазарев");
        task8.setPrintStream(System.out);

        TasksStorageImpl storage = new TasksStorageImpl();
        storage.add(task3);
        storage.add(task5);
        storage.add(task7);
        storage.add(task1);
        storage.add(task8);
        storage.add(task2);
        storage.add(task4);
        storage.add(task6);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        TaskExecutorImpl executor3 = new TaskExecutorImpl();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
