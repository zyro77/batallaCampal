import java.util.ArrayList;
public class Exercit {

    ArrayList<Exercit> exercits;
    /**
     * Arraylist de soldats.
     */
    private ArrayList<Soldat> soldats;
    /**
     * Nom de l'exercit-.
     */
    private String nom;

    /**
     * constructor de exercit.
     * @param nom de l'exercit
     * @param soldats Arraylist de soldats
     */
    public Exercit(ArrayList elSoldat, String elNom) {
        this.soldats = elSoldat;
        this.nom = elNom;
    }

    public ArrayList<Soldat> getSoldats() {
        return soldats;
    }

    public void setSoldats(ArrayList<Soldat> soldats) {
        this.soldats = soldats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Crea un exercit amb tots els seus soldats.
     * @param nom del exercit
     * @param soldat Arraylist que li pasem
     */
    void generarExercit(final String nom, ArrayList soldat){
        exercits = new ArrayList<Exercit>();
        exercits.add(new Exercit(soldat,nom));
    }

}
