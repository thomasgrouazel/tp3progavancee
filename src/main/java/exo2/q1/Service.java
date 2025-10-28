package exo2.q1;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private final List<Equipe> equipes;

    public Service(List<Equipe> equipes) {
        this.equipes = equipes != null ? equipes : new ArrayList<>();
    }

    public List<String> getNomsDirecteursEquipes() {
        List<String> nomsDirecteurs = new ArrayList<>();
        for (Equipe equipe : equipes) {
            if (equipe.getDirecteur() != null) {
                nomsDirecteurs.add(equipe.getDirecteur().getNom());
            }
        }
        return nomsDirecteurs;
    }
}