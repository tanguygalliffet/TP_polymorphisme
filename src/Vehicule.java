// Classe abstraite Véhicule
abstract class Vehicule {
    protected double vitesseMoyenne;


    public Vehicule(double vitesseMoyenne) {
        this.vitesseMoyenne = vitesseMoyenne;
    }

    // Méthode abstraite pour calculer le temps de trajet
    public abstract double calculerTempsTrajet(double distance);
}
