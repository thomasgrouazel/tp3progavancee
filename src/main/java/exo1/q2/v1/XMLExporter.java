package exo1.q2.v1;

import java.util.List;

public class XMLExporter<T> implements Exporter<List<T>> {
    @Override
    public String export(List<T> objects) {
        StringBuilder xml = new StringBuilder();
        xml.append("<items>\n");
        for (T object : objects) {
            xml.append("  <item>").append(object.toString()).append("</item>\n");
        }
        xml.append("</items>");
        return xml.toString();
    }
}