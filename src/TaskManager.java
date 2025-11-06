import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> things = new ArrayList<>();

    public void addTask(String n, String d, String dt) {
        things.add(new Task(n, d, dt));
    }

    public void doTask(int i) {
        Task t = things.get(i);
        t.done = true;
        System.out.println("Tarefa feita: " + t.name);
    }

    public void showAll() {
        for (Task t : things) {
            System.out.println(t.name + " - " + t.desc + " (" + t.date + ") " + (t.done ? "[OK]" : ""));
        }
    }
}

