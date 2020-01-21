package lesson17;

import java.io.*;

public class OutputStream {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(System.in));
            // Используем класс PrintWriter для вывода
            PrintWriter out = new PrintWriter(new FileWriter("data.txt"));
            // Записываем строки, пока не введем строку "stop"
            while (true) {
                String s = in.readLine();
                if (s.equals("stop"))
                    break;
                out.println(s);
            }
            out.flush();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}