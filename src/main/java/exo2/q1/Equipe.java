package exo2.q1;

public class Equipe implements EquipeInterface {
    private final Employé directeur;

    public Equipe(Employé directeur) {
        this.directeur = directeur;
    }

    @Override
    public String getNomDirecteur() {
        return directeur != null ? directeur.getNom() : null;
    }
}