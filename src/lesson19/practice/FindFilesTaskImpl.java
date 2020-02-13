package lesson19.practice;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Objects;

public class FindFilesTaskImpl extends TaskImpl implements FindFilesTask {
    private String directory;
    private String searchString;
    private PrintStream out;

    public FindFilesTaskImpl() {
    }

    public FindFilesTaskImpl(String directory, String searchString) {
        this.directory = directory;
        this.searchString = searchString;
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    public String getDirectory() {
        return directory;
    }
    public String getSearchString() {
        return searchString;
    }
    public PrintStream getOut() {
        return out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File dir = new File(directory);
        if (!dir.exists()) {
            throw new TaskExecutionFailedException("Такой папки не существует!!! " + directory);
        }
        if (dir.isFile()) {
            throw new TaskExecutionFailedException("Это файл, а не папка!!! " + directory);
        }
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().contains(searchString)) {
                    return true;
                }
                return false;
            }
        });
        if (files != null) {
            for (File f : files) {
                out.println(f.getAbsolutePath());
            }

        } else {
            out.println("Поиск не дал результатов");
        }
    }

    @Override
    public String toString() {
        return "FindFilesTaskImpl{" +
                "directory='" + directory + '\'' +
                ", searchString='" + searchString + '\'' +
                ", out=" + out +
                '}';
    }
}
