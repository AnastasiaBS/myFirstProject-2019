package lesson19.homework;

import java.io.*;

public class FileCopyText {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new FileWriter("/D:/Text.txt"));
            while (true) {
                String s = in.readLine();
                if (s.equals("stop"))
            break;
                out.println(s);
            }
            out.flush();
            out.close();

        }catch (IOException e) {
            e.printStackTrace();

        }
    }
}
