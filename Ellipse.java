public class Ellipse implements Forme {

    private double petitAxe;
    private double grandAxe;

    public Ellipse (double petitAxe, double grandAxe){
        this.petitAxe=petitAxe;
        this.grandAxe=grandAxe;
    }

    @Override
    public double aire() {
        return Math.PI * petitAxe * grandAxe;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * Math.sqrt((petitAxe * petitAxe + grandAxe * grandAxe) / 2);
    }

    @Override
    public Forme getCopie() {
        return new Ellipse(petitAxe,grandAxe);
    }
}
