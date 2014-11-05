import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;


public class Soldat {

    Principal Escriptori;

    private GImage imatge;

    ArrayList<Soldat> soldats;

    private int desti;

    public Soldat(double x,double y,GImage nomFitxer , int elDesti){
        this.imatge = nomFitxer;
        imatge.setLocation(x,y);
        this.desti = elDesti;
    }

    public double getX() {
        return imatge.getX();
    }

    public void setX(double x) {
        this.imatge.setLocation(x,imatge.getY());
    }

    public GImage getImatge() {
        return imatge;
    }

    public void setImatge(GImage imatge) {
        this.imatge = imatge;
    }

    public double getY() {
        return imatge.getY();
    }

    public void setY(int y) {
        this.imatge.setLocation(imatge.getX(),y);
    }

    private int getDesti() {
        return desti;
    }

    private void setDesti(int desti) {
        this.desti = desti;
    }




}
