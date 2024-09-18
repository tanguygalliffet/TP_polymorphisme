// Classe Vélo qui hérite de Véhicule
public class Velo extends Vehicule {

    // Constructeur avec vitesse moyenne par défaut pour un vélo
    public Velo() {
        super(15); // Vitesse moyenne de 15 km/h
    }

    //Méthode pour calculer le temps de trajet en h
    @Override
    public double calculerTempsTrajet(double distance) {
        return distance / vitesseMoyenne;
    }
}
