package lesson19.homework;

import java.io.*;

public class FileCopyImpl implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File sour = new File(source);
        File dest = new File(destination);

        if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }

        try {
            BufferedInputStream is = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(destination));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            is.close();
            os.flush();
            os.close();

        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage(), e);
        }

    }
}

