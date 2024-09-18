// Classe Voiture héritant de véhicule
public class Voiture extends Vehicule {


    public Voiture() {
        super(100); // Vitesse moyenne de 100 km/h
    }

    //Méthode pour calculer le temps de trajet en h
    @Override
    public double calculerTempsTrajet(double distance) {
        return distance / vitesseMoyenne;
    }
}
