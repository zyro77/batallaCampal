import java.util.ArrayList;
import java.util.Random;

import acm.program.GraphicsProgram;
import acm.graphics.GImage;

public class Principal extends GraphicsProgram {
    /**
     * Nom del primer exercit.
     */
    private static final String NOM1 = "Patata";
    /**
     * Nom del segon exercit.
     */
    private static final String NOM2 = "Fregida";
    /**
     * Número de soldats.
     */
    private static final int NUMSOLDATS = 12;

    private static ArrayList<Exercit> exercits = new ArrayList<Exercit>();;
    private static ArrayList<Soldat> soldats;
    /**
     *
     */
    private static final long serialVersionUID = 2267694190077033650L;

    Principal Escriptori;
    /**
     * Instanciem el canvas.
     * @param p el canvas
     */
    public void CampBatalla(Principal p) {
        Escriptori = p;
    }

    public void run() {
        CampBatalla camp = new CampBatalla(this);

        setSize(1300,400);
        boolean costat = true;
        generarSoldats(NUMSOLDATS, costat);
        costat = false;
        generarSoldats(NUMSOLDATS, costat);
        boolean fi = false;
        while(!fi){
            moureExercit(exercits.get(0).getSoldats());
            comprobarMorts(exercits.get(0).getSoldats(),exercits.get(1).getSoldats());
            moureExercit(exercits.get(1).getSoldats());
            comprobarMorts(exercits.get(1).getSoldats(),exercits.get(0).getSoldats());
            if(exercits.get(0).getSoldats().size()==0||exercits.get(1).getSoldats().size()==0) {
                fi = true;
            }
        }
    }
    /**
     * crearem els soldats.
     * @param numSoldats El número de soldats que tindrà l'arraylist
     */
    public void generarSoldats(int numSoldats,boolean costat){
        ArrayList<Soldat> soldats = new ArrayList<Soldat>();
        Random rnd = new Random();
        int[] lineas = new int[8];
        for(int i = 0; i < numSoldats; i++) {
            GImage soldat1 = new GImage("soldat.png");
            GImage soldat2 = new GImage("soldatv.png");
            if(costat){
                int numLinea = rnd.nextInt(8);
                soldats.add(new Soldat(lineas[numLinea]*50,numLinea*50,soldat1,getWidth()));
                add(soldat1);
                lineas[numLinea]++;
            }else{
                int numLinea = rnd.nextInt(8);
                soldats.add(new Soldat((getWidth()-soldat2.getWidth())-lineas[numLinea]*50,numLinea*50,soldat2,0));
                add(soldat2);
                lineas[numLinea]++;
            }
        }
        generarExercit(soldats);
    }
    /**
     * Crea un exercit amb tots els seus soldats.
     * @param soldat Arraylist que li pasem
     */
    void generarExercit(ArrayList soldat){
        //exercits = new ArrayList<Exercit>();
        for(int i = 0; i < soldat.size(); i++){
            exercits.add(new Exercit(soldat));
        }
    }

    public void moureExercit(ArrayList<Soldat> soldats){
        Random rnd = new Random();
        for(int i =0; i < soldats.size(); i++){
            int r = rnd.nextInt(1);
            double x = soldats.get(i).getX();
            moureSoldats(soldats,x,i);

        }
    }
    /**
     * Métode que moura els soldats.
     * @param x
     * @param y
     */
    public void moureSoldats(ArrayList<Soldat> soldats,final double x, final int i){
        double xx = soldats.get(i).getImatge().getX();
        if(xx+x<1225){
            soldats.get(i).setX(xx+x);
        }
        //Escriptori.pause(36);
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
