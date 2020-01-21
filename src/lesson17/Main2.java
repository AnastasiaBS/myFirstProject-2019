package lesson17;

import java.io.File;
import java.io.FileFilter;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("D://");

        File[] filesFromD = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                return false;

            }
        });
        for (File f : filesFromD) {
            System.out.println(f.getName());
        }
    }
}
