package lesson19.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy2 {
    public static void main(String[] args) {
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("/D:/Разное/Обои/Новая папка/1.jpg"));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("/D:/Steps.jpg"));

            int c = 0;
            while (true) {
                c = inputStream.read();
                if (c != -1)
                    outputStream.write(c);
                else
                    break;
            }
            inputStream.close();
            outputStream.flush();
            outputStream.close();

        } catch (java.io.IOException e) {
            System.out.println(e.toString());

        }
    }
}
