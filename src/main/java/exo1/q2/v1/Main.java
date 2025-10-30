package exo1.q2.v1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalogue catalogue = new Catalogue();
        catalogue.ajouterProduit(new Produit("souris", 30.0));
        catalogue.ajouterProduit(new Produit("ordi", 600.0));

        Exporter<List<Produit>> xmlExporter = new XMLExporter<>();
        Exporter<List<Produit>> jsonExporter = new JSONExporter<>();
        Exporter<List<Produit>> yamlExporter = new YAMLExporter<>();

        List<Produit> produits = catalogue.getProduits();

        System.out.println("Export XML:");
        System.out.println(xmlExporter.export(produits));

        System.out.println("\nExport JSON:");
        System.out.println(jsonExporter.export(produits));

        System.out.println("\nExport YAML:");
        System.out.println(yamlExporter.export(produits));
    }
}