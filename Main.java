public class Main {
    public static void main(String[] args) {
        // Création d'un tableau de Vehicule contenant des objets Voiture et Moto
        Vehicule[] vehicules = new Vehicule[3];
        
        // Instanciation des objets
        vehicules[0] = new Voiture("Toyota", 2020, 4);
        vehicules[1] = new Moto("Yamaha", 2019, 600);
        vehicules[2] = new Voiture("Honda", 2021, 2);

        // Utilisation du polymorphisme pour afficher les informations de chaque véhicule
        for (Vehicule vehicule : vehicules) {
            vehicule.afficherInfos();  // La méthode appelée dépend du type réel de l'objet (polymorphisme)
            System.out.println();

            if (vehicule instanceof vehiculeElectrique) {
                ((vehiculeElectrique) vehicule).recharger();
            }
            if (vehicule instanceof vehiculeEssence) {
                ((vehiculeEssence) vehicule).remplir();
            }
            
        }

        // Test de la surcharge de la méthode afficherInfos (avec couleur)
        System.out.println("Surcharge de la méthode afficherInfos :");
        vehicules[0].afficherInfos("Rouge");  // Surcharge de la méthode pour le premier véhicule
    }
}
