package exo1.q2.v1;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private final List<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }
}