package lesson19.practice;

import lesson19.CopyWithJava7Utils;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl();
        task1.setFrom("D:\\Разное\\Катюша\\Д.з\\Портал в другую Вселенную_14.11.18.день");
        task1.setTo("D:\\Разное\\Катюша\\Д.з\\Презентация Microsoft Office PowerPoint");
        task1.setFileCopyUtils(new CopyWithJava7Utils());

        CopyFileTaskImpl task2 = new CopyFileTaskImpl();
        task2.setFrom("D:\\Разное\\Катюша\\Д.з\\Презентация_Посуда. Гума, Шаренда");
        task2.setTo("D:\\Разное\\Катюша\\Д.з\\шаблон презентации");
        task2.setFileCopyUtils(new CopyWithJava7Utils());
    }
}
