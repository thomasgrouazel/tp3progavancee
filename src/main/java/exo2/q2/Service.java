package exo2.q2;

import java.util.List;

public class Service implements AvecDirecteur {
    private final Employé directeur;
    private final List<Equipe> equipes;

    public Service(Employé directeur, List<Equipe> equipes) {
        this.directeur = directeur;
        this.equipes = equipes != null ? equipes : List.of();
    }

    @Override
    public Employé getDirecteur() {
        return directeur;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }
}