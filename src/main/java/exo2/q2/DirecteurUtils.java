package exo2.q2;

import java.util.ArrayList;
import java.util.List;

public class DirecteurUtils {
    public static List<String> getNomsDirecteurs(List<? extends AvecDirecteur> entités) {
        List<String> nomsDirecteurs = new ArrayList<>();
        for (AvecDirecteur entité : entités) {
            Employé directeur = entité.getDirecteur();
            if (directeur != null) {
                nomsDirecteurs.add(directeur.getNom());
            }
        }
        return nomsDirecteurs;
    }
}