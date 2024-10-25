// Superclasse Vehicule
public class Vehicule {
    // Attributs communs
    protected String marque;
    protected int annee;

    // Constructeur
    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
    }

    // Méthode pour afficher les informations de base (polymorphisme)
    public void afficherInfos() {
        System.out.println("Véhicule marque : " + marque + ", année : " + annee);
    }

    // Surcharge de la méthode afficherInfos avec un paramètre de couleur
    public void afficherInfos(String couleur) {
        System.out.println("Véhicule marque : " + marque + ", année : " + annee + ", couleur : " + couleur);
    }

}
