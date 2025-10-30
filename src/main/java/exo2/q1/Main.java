package exo2.q1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employé directeur1 = new Employé("Alice");
        Employé directeur2 = new Employé("Bob");

        Equipe equipe1 = new Equipe(directeur1);
        Equipe equipe2 = new Equipe(directeur2);
        Equipe equipeSansDirecteur = new Equipe(null);

        Service<Equipe> service = new Service<>(List.of(equipe1, equipe2, equipeSansDirecteur));

        List<String> nomsDirecteurs = service.getNomsDirecteursEquipes();
        System.out.println("Noms des directeurs : " + nomsDirecteurs);
    }
}