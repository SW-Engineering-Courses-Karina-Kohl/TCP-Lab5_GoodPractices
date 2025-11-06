public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Estudar Java", "Rever conceitos de modularidade", "2025-11-12");
        manager.addTask("Preparar slides", "Montar material da aula", "2025-11-15");
        manager.addTask("Comprar café", "Café para o laboratório", "2025-11-10");

        manager.showAll();

        System.out.println("\n=== Exportando relatório ===");
        manager.exportTasksReport("report.txt");
    }
}
