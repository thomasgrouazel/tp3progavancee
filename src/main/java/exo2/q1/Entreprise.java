package exo2.q1;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private final List<Département> départements;

    public Entreprise(List<Département> départements) {
        this.départements = départements != null ? départements : new ArrayList<>();
    }

    public List<String> getNomsDirecteursEquipes() {
        List<String> nomsDirecteurs = new ArrayList<>();
        for (Département département : départements) {
            nomsDirecteurs.addAll(département.getNomsDirecteursEquipes());
        }
        return nomsDirecteurs;
    }
}