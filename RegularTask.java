//inheritance
public class RegularTask implements ITask {
    //enkapsulasi
    private String title;
    private boolean isDone;
    //static variable dan konstanta final
    private static final int DEFAULT_PRIORITY = 0;
    private int priority;

    //overloading
    public RegularTask(String title, int priority) {
        this.title = title;
        this.isDone = false;
        setPriority(priority);
    }

    public RegularTask(String title) {
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
        return "Regular Task - " + getTitle() + ", Priority: " + getPriority() + ", Done: " + isDone();
    }
}