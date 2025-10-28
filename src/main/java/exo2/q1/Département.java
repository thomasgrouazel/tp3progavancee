package exo2.q1;

import java.util.ArrayList;
import java.util.List;

public class Département {
    private final List<Service> services;

    public Département(List<Service> services) {
        this.services = services != null ? services : new ArrayList<>();
    }

    public List<String> getNomsDirecteursEquipes() {
        List<String> nomsDirecteurs = new ArrayList<>();
        for (Service service : services) {
            nomsDirecteurs.addAll(service.getNomsDirecteursEquipes());
        }
        return nomsDirecteurs;
    }
}