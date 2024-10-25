// Sous-classe Voiture qui hérite de Vehicule
public class Voiture extends Vehicule implements vehiculeElectrique {
    // Attribut spécifique à la Voiture
    private int nombreDePortes;

    // Constructeur
    public Voiture(String marque, int annee, int nombreDePortes) {
        super(marque, annee); // Appel au constructeur de la superclasse
        this.nombreDePortes = nombreDePortes;
    }

    // Redéfinition (override) de la méthode afficherInfos pour ajouter des informations spécifiques à la Voiture
    @Override
    public void afficherInfos() {
        System.out.println("Voiture marque : " + marque + ", année : " + annee + ", nombre de portes : " + nombreDePortes);
    }

    // Implementing the interface
    @Override
    public void recharger() {
        System.out.println("Batterie est en charge...");
    }
}