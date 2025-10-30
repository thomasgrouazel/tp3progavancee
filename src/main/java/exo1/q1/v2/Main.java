package exo1.q1.v2;

public class Main {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger("calcul.log");
        LogicielDeCalcul logicielAvecFileLogger = new LogicielDeCalcul(fileLogger);
        logicielAvecFileLogger.calculer(3, 5);

        Logger memoryLogger = new EnMemoireLogger();
        LogicielDeCalcul logicielAvecMemoryLogger = new LogicielDeCalcul(memoryLogger);
        logicielAvecMemoryLogger.calculer(10, 20);
        System.out.println("Logs en mémoire : " + ((EnMemoireLogger) memoryLogger).getLogs());

        Logger rienLogger = new RienLogger();
        LogicielDeCalcul logicielAvecRienLogger = new LogicielDeCalcul(rienLogger);
        logicielAvecRienLogger.calculer(7, 8);
    }
}