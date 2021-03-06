package lesson19.homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopyImpl3 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File sour = new File(source);
        File dest = new File(destination);

        if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }
        try {
            Files.copy(sour.toPath(), dest.toPath());

        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage(), e);
        }
    }
}
