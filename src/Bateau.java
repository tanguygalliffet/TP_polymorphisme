// Classe Bateau qui hérite de Véhicule
public class Bateau extends Vehicule {

    // Constructeur avec vitesse moyenne par défaut pour un bateau
    public Bateau() {
        super(40); // Vitesse moyenne de 40 km/h
    }

    //Méthode pour calculer le temps de trajet en h
    @Override
    public double calculerTempsTrajet(double distance) {
        return distance / vitesseMoyenne;
    }
}
