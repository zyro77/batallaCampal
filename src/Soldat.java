import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;


public class Soldat {

    Principal Escriptori;

    private GImage imatge;

    public Soldat(double x,double y,GImage nomFitxer){
        this.imatge = nomFitxer;
        imatge.setLocation(x,y);
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
    /**
     * crearem els soldats.
     * @param numSoldats El número de soldats que tindrà l'arraylist
     */
    public ArrayList generarSoldats(int numSoldats,boolean costat){
        ArrayList<Soldat> soldats = new ArrayList<Soldat>();
        Random rnd = new Random();
        int[] lineas = new int[8];
        for(int i = 0; i < numSoldats; i++) {
            GImage soldat1 = new GImage("soldat.png");
            GImage soldat2 = new GImage("soldatv.png");
            if(costat){
                int numLinea = rnd.nextInt(8);
                soldats.add(new Soldat(lineas[numLinea]*50,numLinea*50,soldat1));
                Escriptori.add(soldat1);
                lineas[numLinea]++;
            }else{
                int numLinea = rnd.nextInt(8);
                soldats.add(new Soldat((Escriptori.getWidth()-soldat2.getWidth())-lineas[numLinea]*50,numLinea*50,soldat2));
                Escriptori.add(soldat2);
                lineas[numLinea]++;
            }
        }
        return soldats;
    }
    /**
     * Métode que moura els soldats.
     * @param x
     * @param y
     */
    public void moureSoldats(final double x, final double y){
    }


}
