import java.util.ArrayList;

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
    /**
     *
     */
    private static final long serialVersionUID = 2267694190077033650L;

    public void run() {
        CampBatalla camp = new CampBatalla(this);
        setSize(1300,400);
        boolean costat = true;
        ArrayList<Soldat> temp = soldats.generarSoldats(NUMSOLDATS, costat);
        exercits.generarExercit(NOM1 ,temp);
        costat = false;
        ArrayList<Soldat> temp2 = soldats.generarSoldats(NUMSOLDATS, costat);
        soldat.generarExercit(NOM2 ,temp);

    }

}
