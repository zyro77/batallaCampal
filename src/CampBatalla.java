import java.util.ArrayList;
import java.util.Random;

import acm.program.GraphicsProgram;
import acm.graphics.GImage;
public class CampBatalla {
    Principal Escriptori;
    private static ArrayList<Exercit> exercits = new ArrayList<Exercit>();
    ArrayList<Soldat> soldats;
    /**
     * Instanciem el canvas.
     * @param p el canvas
     */
    public CampBatalla(Principal p) {
        Escriptori = p;
    }
    public void afegirExCamp(final Exercit ex){
        exercits.add(ex);
        for(Soldat s : ex.getSoldats()){
            Escriptori.add(s.getImatge());
        }
    }
    public final void batalla(){

    }



}




