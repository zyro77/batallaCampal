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

    private static ArrayList<Exercit> exercits = new ArrayList<Exercit>();
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
        Exercit exercit = generarExercit(NUMSOLDATS, costat);
        camp.afegirExCamp(exercit);
        costat = false;
        exercit = generarExercit(NUMSOLDATS, costat);
        camp.afegirExCamp(exercit);

        boolean fi = false;
        while(!fi){

            /**exercits.get(0).moureExercit(exercits.get(0).getSoldats());
            exercits.get(0).moureExercit(exercits.get(0).getSoldats());
            comprobarMorts(exercits.get(0).getSoldats(),exercits.get(1).getSoldats());
            exercits.get(1).moureExercit(exercits.get(1).getSoldats());
            comprobarMorts(exercits.get(1).getSoldats(),exercits.get(0).getSoldats());
            if(exercits.get(0).getSoldats().size()==0||exercits.get(1).getSoldats().size()==0) {
                fi = true;
            }
            */
        }
    }

    /**
     * Crea un exercit amb tots els seus soldats.
     * @param soldat Arraylist que li pasem
     */
    public Exercit generarExercit(final int NUMSOLDATS, final boolean costat){
        Exercit x = new Exercit(NOM1);
        Random rnd = new Random();
        int[] lineas = new int[8];
        for(int i = 0; i < NUMSOLDATS; i++){
            GImage soldat1 = new GImage("soldat.png");
            GImage soldat2 = new GImage("soldatv.png");
            int numLinea = rnd.nextInt(8);
            Soldat ras = null;
            if(costat == true){
                ras = new Soldat(lineas[numLinea]*50,numLinea*50,soldat1,getWidth());
            }else{
                ras = new Soldat(((lineas[numLinea]*50)*(-1)+getWidth()-50),numLinea*50,soldat2,0);
            }
            lineas[numLinea]++;
            x.allistarSoldat(ras);
        }
        return x;
    }

}
