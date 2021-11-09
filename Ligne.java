public class Ligne implements Forme{

    private double longueur;

    public Ligne (double longueur){
        this.longueur=longueur;
    }

    @Override
    public double aire() {
        return 0;
    }

    @Override
    public double perimetre() {
        return longueur;
    }

    @Override
    public Forme getCopie() {
        return new Ligne(longueur);
    }
}
