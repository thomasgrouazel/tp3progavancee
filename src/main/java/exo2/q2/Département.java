package exo2.q2;

import java.util.List;

public class Département implements AvecDirecteur {
    private final Employé directeur;
    private final List<Service> services;

    public Département(Employé directeur, List<Service> services) {
        this.directeur = directeur;
        this.services = services != null ? services : List.of();
    }

    @Override
    public Employé getDirecteur() {
        return directeur;
    }

    public List<Service> getServices() {
        return services;
    }
}