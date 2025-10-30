package exo1.q2.v1;

import java.lang.reflect.Field;
import java.util.List;

public class YAMLExporter<T> implements Exporter<List<T>> {
    @Override
    public String export(List<T> objects) {
        StringBuilder yaml = new StringBuilder();
        for (T object : objects) {
            yaml.append("- ").append(object.getClass().getSimpleName().toLowerCase()).append(":\n");
            for (Field field : object.getClass().getDeclaredFields()) {
                field.setAccessible(true); // Permet d'accéder aux champs privés
                try {
                    yaml.append("    ").append(field.getName()).append(": ").append(field.get(object)).append("\n");
                } catch (IllegalAccessException e) {
                    yaml.append("    ").append(field.getName()).append(": ").append("inaccessible\n");
                }
            }
        }
        return yaml.toString();
    }
}