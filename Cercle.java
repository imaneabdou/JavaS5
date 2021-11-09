public class Cercle implements Forme {

    private double rayon;

    public Cercle (double r){ rayon=r; }

    @Override
    public double aire() {
        return rayon*rayon*Math.PI;
    }

    @Override
    public double perimetre() {
        return 2*rayon*Math.PI;
    }

    @Override
    public Forme getCopie() {
        return new Cercle(rayon);
    }
}
