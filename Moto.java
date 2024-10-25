// Sous-classe Moto qui hérite de Vehicule
public class Moto extends Vehicule implements vehiculeEssence {
    // Attribut spécifique à la Moto
    private int cylindree;

    // Constructeur
    public Moto(String marque, int annee, int cylindree) {
        super(marque, annee); // Appel au constructeur de la superclasse
        this.cylindree = cylindree;
    }

    // Redéfinition (override) de la méthode afficherInfos pour ajouter des informations spécifiques à la Moto
    @Override
    public void afficherInfos() {
        System.out.println("Moto marque : " + marque + ", année : " + annee + ", cylindrée : " + cylindree + " cc");
    }

    // Implementing the interface
    @Override
    public void remplir() {
        System.out.println("Faire de remplir en cours...");
    }
}
