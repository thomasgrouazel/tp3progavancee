package exo1.q1.v2;

public class LogicielDeCalcul {
    private final Logger logger;

    public LogicielDeCalcul(Logger logger) {
        this.logger = logger;
    }

    public int calculer(int a, int b) {
        logger.log("Début du calcul : " + a + " + " + b);
        int resultat = a + b;
        logger.log("Résultat du calcul : " + resultat);
        return resultat;
    }
}