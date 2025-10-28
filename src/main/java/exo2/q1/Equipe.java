package exo2.q1;

public class Equipe {
    private final Employé directeur;

    public Equipe(Employé directeur) {
        this.directeur = directeur;
    }

    public Employé getDirecteur() {
        return directeur;
    }
}