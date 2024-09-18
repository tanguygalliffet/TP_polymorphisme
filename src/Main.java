import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Distance à parcourir
        double distance = 150;

        // Création d'un tableau de véhicules
        Vehicule[] vehicules = { new Voiture(), new Velo(), new Bateau() };

        // Formatage des résultats à 1 ou 2 décimales
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Pour une distance de " + distance + " km :\n");

        // Calcul et affichage du temps de trajet pour chaque véhicule
        for (Vehicule v : vehicules) {
            String typeVehicule = v.getClass().getSimpleName();
            double temps = v.calculerTempsTrajet(distance);

            if (typeVehicule.equals("Voiture")) {
                System.out.println("Une Voiture devrait mettre " + df.format(temps) + " heures.");
            } else if (typeVehicule.equals("Velo")) {
                System.out.println("Un Vélo devrait mettre " + df.format(temps) + " heures.");
            } else if (typeVehicule.equals("Bateau")) {
                System.out.println("Un Bateau devrait mettre " + df.format(temps) + " heures.");
            }
        }
    }
}
