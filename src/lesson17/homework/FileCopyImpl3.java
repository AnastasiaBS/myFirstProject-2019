package lesson17.homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyImpl3 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            File file = new File(source);
            File file1 = new File(destination);

            Files.copy(file.toPath(), file1.toPath());


        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage(), e);
        }
    }
}
