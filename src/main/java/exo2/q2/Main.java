package exo2.q2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employé directeurEntreprise = new Employé("Alice");
        Employé directeurDépartement = new Employé("Bob");
        Employé directeurService = new Employé("Charlie");
        Employé directeurEquipe = new Employé("David");

        Equipe equipe = new Equipe(directeurEquipe);
        Service service = new Service(directeurService, List.of(equipe));
        Département département = new Département(directeurDépartement, List.of(service));
        Entreprise entreprise = new Entreprise(directeurEntreprise, List.of(département));

        
        List<String> nomsDirecteursDépartements = DirecteurUtils.getNomsDirecteurs(entreprise.getDépartements());
        System.out.println("Directeurs des départements : " + nomsDirecteursDépartements);

        
        List<String> nomsDirecteursServices = DirecteurUtils.getNomsDirecteurs(département.getServices());
        System.out.println("Directeurs des services : " + nomsDirecteursServices);

        
        List<String> nomsDirecteursEquipes = DirecteurUtils.getNomsDirecteurs(service.getEquipes());
        System.out.println("Directeurs des équipes : " + nomsDirecteursEquipes);
    }
}