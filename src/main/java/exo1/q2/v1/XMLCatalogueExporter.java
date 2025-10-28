package exo1.q2.v1;

public class XMLCatalogueExporter implements CatalogueExporter {
    @Override
    public String export(Catalogue catalogue) {
        StringBuilder xml = new StringBuilder();
        xml.append("<catalogue>\n");
        for (Produit produit : catalogue.getProduits()) {
            xml.append("  <produit>\n");
            xml.append("    <designation>").append(produit.getDesignation()).append("</designation>\n");
            xml.append("    <prix>").append(produit.getPrix()).append("</prix>\n");
            xml.append("  </produit>\n");
        }
        xml.append("</catalogue>");
        return xml.toString();
    }
}