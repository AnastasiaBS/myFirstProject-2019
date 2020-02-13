package lesson19.homework;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, FileCopyFailedException {
       FileCopyImpl copy = new FileCopyImpl();
       String source = "/D:/Text.txt";
       String destination = "/D:/Copy.txt";
       copy.copyFile(source, destination);

//        FileCopyImpl2 copyImpl2 = new FileCopyImpl2();
//        String source = "/D:/Text.txt";
//        String destination = "/D:/Copy.txt";
//        copyImpl2.copyFile(source, destination);

//        FileCopyImpl3 copyImpl3 = new FileCopyImpl3();
//        String source = "/D:/Text.txt";
//        String destination = "/D:/Copy.txt";
//        copyImpl3.copyFile(source, destination);

    }
}
