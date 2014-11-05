import java.util.ArrayList;
public class Exercit {

    ArrayList<Exercit> exercits;
    /**
     * Arraylist de soldats.
     */
    private ArrayList<Soldat> soldats;

    /**
     * constructor de exercit.
     * @param nom de l'exercit
     * @param soldats Arraylist de soldats
     */
    public Exercit(ArrayList elSoldat) {
        this.soldats = elSoldat;
    }

    public ArrayList<Soldat> getSoldats() {
        return soldats;
    }

    public void setSoldats(ArrayList<Soldat> soldats) {
        this.soldats = soldats;
    }

}
