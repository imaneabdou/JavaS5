import java.util.Collection;
import java.util.HashSet;

public class Dessin {

    private Collection<Image> images;

    public Dessin () {
        this.images=new HashSet<>();
    }

    public double perimetre(){
        double p = 0;
        for (Image i:images)
            p += i.perimetre();
        return p;
    }

    public double aire(){
        double a = 0;
        for (Image i:images)
            a += i.aire();
        return a;
    }

    public void addImage(Image i){
        images.add(i);
    }

    public Dessin getCopie(){
        Dessin copie=new Dessin();
        for (Image i: images)
            copie.addImage(i.getCopie());

        return copie;
    }
}