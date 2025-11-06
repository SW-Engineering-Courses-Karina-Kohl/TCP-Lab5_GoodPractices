public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask("Comprar café", "Comprar café para o escritório", "2025-11-10");
        tm.addTask("Enviar relatório", "Enviar relatório mensal ao gestor", "2025-11-15");

        tm.showAll();
        tm.doTask(0);
        tm.showAll();
    }
}
