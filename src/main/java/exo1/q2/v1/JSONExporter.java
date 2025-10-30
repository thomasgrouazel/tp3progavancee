package exo1.q2.v1;

import java.util.List;

public class JSONExporter<T> implements Exporter<List<T>> {
    @Override
    public String export(List<T> objects) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        for (int i = 0; i < objects.size(); i++) {
            json.append("\"").append(objects.get(i).toString()).append("\"");
            if (i < objects.size() - 1) {
                json.append(", ");
            }
        }
        json.append("]");
        return json.toString();
    }
}