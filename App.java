public class App {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        //Object
        ITask task1 = new RegularTask("Complete homework", 2);
        ITask task2 = new ImportantTask("Submit project report", 1);
        ITask task3 = new RegularTask("Read a book", 3);

        // Overloading: Menambahkan tugas tanpa prioritas
        ITask task4 = new RegularTask("Clean the room");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        taskManager.displayTasks();

        taskManager.markTaskAsDone(0);

        taskManager.displayTasks();
    }
}
