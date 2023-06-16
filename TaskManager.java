import java.util.ArrayList;

public class TaskManager {
    //nantinya untuk menyimpan objek-objek yang mengimplementasikan interface ITask
    //arraylist
    private ArrayList<ITask> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(ITask task) {
        tasks.add(task);
    }

    public void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getTaskDetails());
            }
        }
    }
}