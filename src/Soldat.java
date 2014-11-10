import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;


public class Soldat {

    static Principal Escriptori;

    private GImage imatge;

    ArrayList<Soldat> soldats;

    static ArrayList<Soldat> soldatsMorts;

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

    public static void moureSoldats(ArrayList<Soldat> soldats){
        Random rnd = new Random();
        for(Soldat s : soldats){
            int r = rnd.nextInt(10);
            if(s.getX()<s.getDesti()&&s.getDesti()==1250){
                s.setX(s.getX()+r);
            }else if(s.getX()>s.getDesti()&&s.getDesti()==0){
                s.setX(s.getX()+(r*(-1)));
            }
        }


    }
    public static void comprobarMorts(ArrayList<Soldat> soldats, ArrayList<Soldat> soldatsEnemics){
        soldatsMorts = new ArrayList<Soldat>();
        for(int i = soldats.size()-1; i >= 0; i--){
            for(int j = soldatsEnemics.size()-1; j >= 0; j--){
                if(soldats.get(i).getX()>soldatsEnemics.get(j).getX()&&
                    soldats.get(i).getY()==soldatsEnemics.get(j).getY()&&soldats.get(i).getDesti()==1250){
                    //Escriptori.remove(soldatsEnemics.get(j).getImatge());
                    soldatsMorts.add(soldatsEnemics.get(j));
                }else if(soldats.get(i).getX()<soldatsEnemics.get(j).getX()&&
                        soldats.get(i).getY()==soldatsEnemics.get(j).getY()&&soldats.get(i).getDesti()==0){
                        //Escriptori.remove(soldats.get(i).getImatge());
                        soldatsMorts.add(soldatsEnemics.get(i));
                    }
            }
        }
        for(Soldat s : soldatsMorts){
            soldatsMorts.remove(s);
        }

    }


}
