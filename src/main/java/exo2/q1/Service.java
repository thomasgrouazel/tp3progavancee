package exo2.q1;

import java.util.ArrayList;
import java.util.List;

public class Service<T extends EquipeInterface> {
    private final List<T> equipes;

    public Service(List<T> equipes) {
        this.equipes = equipes != null ? equipes : new ArrayList<>();
    }

    public List<String> getNomsDirecteursEquipes() {
        List<String> nomsDirecteurs = new ArrayList<>();
        for (T equipe : equipes) {
            String nomDirecteur = equipe.getNomDirecteur();
            if (nomDirecteur != null) {
                nomsDirecteurs.add(nomDirecteur);
            }
        }
        return nomsDirecteurs;
    }
}