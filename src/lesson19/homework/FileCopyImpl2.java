package lesson19.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopyImpl2 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File sour = new File(source);
        File dest = new File(destination);

        if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }

        try {
            FileChannel sourceChannel = new FileInputStream(source).getChannel();
            FileChannel destChannel = new FileOutputStream(destination).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());

            sourceChannel.close();
            destChannel.close();

        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage(), e);
        }
    }
}
