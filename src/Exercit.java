import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;
public class Exercit {

    ArrayList<Exercit> exercits;
    /**
     * Arraylist de soldats.
     */
    private ArrayList<Soldat> soldats;

    static ArrayList<Soldat> soldatsMorts;


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
    public static void moureSoldats(ArrayList<Soldat> soldats){
        for(Soldat s : soldats){
            Soldat.moureSoldat(s);
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
                        soldatsMorts.add(soldats.get(i));
                    }
            }
        }
        Exercit.matarSoldats(soldatsMorts);

    }
    public static void matarSoldats(final ArrayList<Soldat> soldats){
        for (Soldat s: soldats) {
                GImage foto = s.getImatge();
                foto.getParent().remove(foto);
                soldats.remove(s);
        }
    }
}
