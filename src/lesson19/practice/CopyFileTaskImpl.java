package lesson19.practice;

import lesson19.FileCopyUtils;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {
    private String from;
    private String to;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public CopyFileTaskImpl() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public FileCopyUtils getCopyUtils() {
        return copyUtils;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            this.copyUtils.copyFile(from, to);
        } catch (Exception e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }
}