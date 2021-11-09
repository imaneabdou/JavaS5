import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Image {

    private Collection<Forme> formes;

    public Image () {
        this.formes=new HashSet<>();
    }
    
    public double perimetre(){
        double p = 0;
        for (Forme f:formes) 
            p += f.perimetre();
        return p;
    }
    
    public double aire(){
        double a = 0;
        for (Forme f:formes)
            a += f.aire();
        return a;
    }

    public void addForme(Forme f){
        formes.add(f);
    }

    public Image getCopie(){
        Image copie=new Image();
        for (Forme f: formes)
            copie.addForme(f.getCopie());

        return copie;
    }

    public void trier(){
        Collections.sort(formes, Comparator.comparing(Forme::perimetre));
    }
}