package exo1.q1.v2;

import java.util.ArrayList;
import java.util.List;

public class EnMemoireLogger implements Logger {
    private final List<String> logs = new ArrayList<>();

    @Override
    public void log(String message) {
        logs.add(message);
    }

    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }
}