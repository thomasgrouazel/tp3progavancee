package exo2.q1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employé directeur1 = new Employé("Alice");
        Employé directeur2 = new Employé("Michel");

        Equipe equipe1 = new Equipe(directeur1);
        Equipe equipe2 = new Equipe(directeur2);

        Service service = new Service(List.of(equipe1, equipe2));
        Département département = new Département(List.of(service));
        Entreprise entreprise = new Entreprise(List.of(département));

        List<String> nomsDirecteurs = entreprise.getNomsDirecteursEquipes();
        System.out.println("Noms des directeurs : " + nomsDirecteurs);
    }
}