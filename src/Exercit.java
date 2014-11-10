import java.util.ArrayList;
import java.util.Random;
public class Exercit {

    ArrayList<Exercit> exercits;
    /**
     * Arraylist de soldats.
     */
    private ArrayList<Soldat> soldats;
    private String nom;

    /**
     * constructor de exercit.
     * @param nom de l'exercit
     * @param soldats Arraylist de soldats
     */
    public Exercit(final String elNom) {
        this.nom = elNom;
        soldats = new ArrayList<Soldat>();
    }

    public ArrayList<Soldat> getSoldats() {
        return soldats;
    }

    public void setSoldats(ArrayList<Soldat> soldats) {
        this.soldats = soldats;
    }
    public void allistarSoldat(Soldat soldat){
        soldats.add(soldat);
    }

    public final int quantitatSoldats(){
        return soldats.size();
    }
    public static void matarSoldats(final ArrayList<Soldat> soldats){
        
    }
}
