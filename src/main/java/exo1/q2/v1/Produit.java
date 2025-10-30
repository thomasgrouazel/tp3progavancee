package exo1.q2.v1;

public class Produit {
    private final String designation;
    private final double prix;

    public Produit(String designation, double prix) {
        this.designation = designation;
        this.prix = prix;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }
}