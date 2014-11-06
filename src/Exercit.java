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

    public void moureExercit(ArrayList<Soldat> soldats){
        Random rnd = new Random();
        for(int i =0; i < soldats.size(); i++){
            int r = rnd.nextInt(20);
            double x = soldats.get(i).getX();
            Soldat.moureSoldats(soldats,x,i,r);

        }
    }
}
