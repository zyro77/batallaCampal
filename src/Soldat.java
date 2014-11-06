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

    public static void moureSoldats(ArrayList<Soldat> soldats,final double x, final int i,final int r){
        if(Escriptori.getWidth()==soldats.get(i).getDesti()){
            if(x<soldats.get(i).getDesti()){
                soldats.get(i).setX(r+x);
            }
        }else{
            if(x>soldats.get(i).getDesti()){
                int s = r * (-1);
                soldats.get(i).setX(r+x);
            }
        }


    }
    public void comprobarMorts(ArrayList<Soldat> soldats, ArrayList<Soldat> soldatsEnemics){
        for(int i = soldats.size(); i < 0; i--){
            for(int j = soldatsEnemics.size(); j < 0; j--){
                if(soldats.get(i).getX()<soldatsEnemics.get(j).getX()&&
                        soldats.get(i).getY()==soldatsEnemics.get(j).getY()){
                    soldatsEnemics.remove(j);
                }
            }
        }
    }


}
