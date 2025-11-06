import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManager {

    ArrayList<Task> things = new ArrayList<>();

    public void addTask(String n, String d, String dt) {
        things.add(new Task(n, d, dt));
        System.out.println("Tarefa adicionada: " + n);
    }

    public void doTask(int i) {
        if (i >= 0 && i < things.size()) {
            Task t = things.get(i);
            t.done = true;
            System.out.println("Tarefa concluída: " + t.name);
        }
    }

    public void showAll() {
        for (Task t : things) {
            System.out.println(t.name + " - " + t.desc + " (" + t.date + ") " + (t.done ? "[OK]" : ""));
        }
    }

    // 🚨 Método que faz várias coisas ao mesmo tempo (para refatoração)
    public void exportTasksReport(String filename) {
        System.out.println("Gerando relatório de tarefas...");
        StringBuilder report = new StringBuilder();

        // Gera cabeçalho e conteúdo
        report.append("Relatório de Tarefas\n");
        report.append("====================\n");
        int doneCount = 0;
        for (Task t : things) {
            report.append(t.name + " - " + t.desc + " - " + t.date + (t.done ? " [OK]" : " [Pendente]") + "\n");
            if (t.done) doneCount++;
        }

        // Calcula percentual
        double percent = (things.size() == 0) ? 0 : ((double) doneCount / things.size()) * 100;
        report.append("\nConcluídas: " + doneCount + "/" + things.size() + " (" + percent + "%)\n");

        // Salva o relatório em arquivo
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(report.toString());
            fw.close();
            System.out.println("Relatório salvo em " + filename);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o relatório: " + e.getMessage());
        }

        // Imprime o relatório no console
        System.out.println(report);
    }
}
