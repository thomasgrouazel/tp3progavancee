package exo2.q2;

import java.util.List;

public class Entreprise implements AvecDirecteur {
    private final Employé directeur;
    private final List<Département> départements;

    public Entreprise(Employé directeur, List<Département> départements) {
        this.directeur = directeur;
        this.départements = départements != null ? départements : List.of();
    }

    @Override
    public Employé getDirecteur() {
        return directeur;
    }

    public List<Département> getDépartements() {
        return départements;
    }
}