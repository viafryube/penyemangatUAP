//inheritance
public class ImportantTask implements ITask {
    //enkapsulasi
    private String title;
    private boolean isDone;
    //static variable dan konstanta final
    private static final int DEFAULT_PRIORITY = 0;
    private int priority;

    //overloading
    public ImportantTask(String title, int priority) {
        this.title = title;
        this.isDone = false;
        setPriority(priority);
    }

    public ImportantTask(String title) {
        this.title = title;
        this.isDone = false;
        setPriority(DEFAULT_PRIORITY);
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }

    //overriding
    //Instance method
    public void markAsDone() {
        isDone = true;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        // Validasi prioritas
        if (priority >= 0) {
            this.priority = priority;
        } else {
            this.priority = DEFAULT_PRIORITY;
        }
    }

    //overriding
    public String getTaskDetails() {
        return "Important Task - " + getTitle() + ", Priority: " + getPriority() + ", Done: " + isDone();
    }
}