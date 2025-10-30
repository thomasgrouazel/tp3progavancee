package exo2.q2;

public class Equipe implements AvecDirecteur {
    private final Employé directeur;

    public Equipe(Employé directeur) {
        this.directeur = directeur;
    }

    @Override
    public Employé getDirecteur() {
        return directeur;
    }
}