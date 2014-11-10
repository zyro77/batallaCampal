import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;


public class Soldat {

    static Principal Escriptori;

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

    public int getDesti() {
        return desti;
    }

    public void setDesti(int desti) {
        this.desti = desti;
    }

    public static void moureSoldat(Soldat soldat){
        Random rnd = new Random();
            int r = rnd.nextInt(10);
            if(soldat.getX()<soldat.getDesti()&&soldat.getDesti()==1250){
                soldat.setX(soldat.getX()+r);
            }else if(soldat.getX()>soldat.getDesti()&&soldat.getDesti()==0){
                soldat.setX(soldat.getX()+(r*(-1)));
            }


    }



}
