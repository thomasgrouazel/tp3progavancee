package exo1.q2.v1;

public class JSONCatalogueExporter implements CatalogueExporter {
    @Override
    public String export(Catalogue catalogue) {
        StringBuilder json = new StringBuilder();
        json.append("{\"@type\":\"catalogue\", \"contenu\":[");
        for (int i = 0; i < catalogue.getProduits().size(); i++) {
            Produit produit = catalogue.getProduits().get(i);
            json.append("{\"@type\":\"produit\", \"contenu\":[");
            json.append("{\"@type\":\"designation\", \"contenu\":[{\"texte\":\"")
                .append(produit.getDesignation()).append("\"}]},");
            json.append("{\"@type\":\"prix\", \"contenu\":[{\"texte\":\"")
                .append(produit.getPrix()).append("\"}]}");
            json.append("]}");
            if (i < catalogue.getProduits().size() - 1) {
                json.append(",");
            }
        }
        json.append("]}");
        return json.toString();
    }
}