import java.util.ArrayList;
import java.util.Random;
import acm.program.GraphicsProgram;
import acm.graphics.GImage;
public class CampBatalla {
	Principal Escriptori;
	
	public CampBatalla(Principal p) {
		Escriptori = p;
	}

	public void camp(){
		
		int[] lineas = new int[8];
		int[] lineasv = new int[8];
		Random rnd = new Random();
		ArrayList<Soldat> soldats = new ArrayList<Soldat>();
		for(int i =0;i<20;i++){
			
			if(i%2==0){
				GImage soldat = new GImage("soldat.png");
				Escriptori.add(soldat);
				soldats.add(new Soldat(0,rnd.nextInt(8)*50,soldat));
				
			}else{
				GImage soldatv = new GImage("soldatv.png");
				Escriptori.add(soldatv);
				soldats.add(new Soldat(Escriptori.getWidth()-50,rnd.nextInt(8)*50,soldatv));
			}
		}
		
	}

	

}
