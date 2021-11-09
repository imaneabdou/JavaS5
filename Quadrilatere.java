public class Quadrilatere extends Polygone{

    private double longueur;
    private double largeur;

    public Quadrilatere (double longueur, double largeur){

        this.longueur=longueur;
        this.largeur=largeur;
    }

    @Override
    public double aire() {
        return longueur*largeur;
    }

    @Override
    public double perimetre() {
        return 2*longueur + 2*largeur;
    }

    @Override
    public Forme getCopie() {
        return new Quadrilatere(longueur,largeur);
    }
}
