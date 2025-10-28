package exo1.q2.v1;

public class YAMLCatalogueExporter implements CatalogueExporter {
    private int profondeur = 0;

    @Override
    public String export(Catalogue catalogue) {
        StringBuilder yaml = new StringBuilder();
        yaml.append("catalogue:\n");
        profondeur++;
        for (Produit produit : catalogue.getProduits()) {
            appendIndentation(yaml);
            yaml.append("- produit:\n");
            profondeur++;
            appendIndentation(yaml);
            yaml.append("designation: ").append(produit.getDesignation()).append("\n");
            appendIndentation(yaml);
            yaml.append("prix: ").append(produit.getPrix()).append("\n");
            profondeur--;
        }
        profondeur--;
        return yaml.toString();
    }

    private void appendIndentation(StringBuilder yaml) {
        yaml.append("  ".repeat(profondeur));
    }
}