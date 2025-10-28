package exo1.q2.v1;

public class Main {
    public static void main(String[] args) {
        Catalogue catalogue = new Catalogue();
        catalogue.ajouterProduit(new Produit("souris", 30.0));
        catalogue.ajouterProduit(new Produit("ordi", 600.0));

        CatalogueExporter xmlExporter = new XMLCatalogueExporter();
        CatalogueExporter jsonExporter = new JSONCatalogueExporter();
        CatalogueExporter yamlExporter = new YAMLCatalogueExporter(); // Ajout de l'exportateur YAML

        System.out.println("Export XML:");
        System.out.println(catalogue.exporter(xmlExporter));

        System.out.println("\nExport JSON:");
        System.out.println(catalogue.exporter(jsonExporter));

        System.out.println("\nExport YAML:");
        System.out.println(catalogue.exporter(yamlExporter)); 
    }
}