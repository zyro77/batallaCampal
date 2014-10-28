import acm.program.GraphicsProgram;
import acm.graphics.GImage;

public class Principal extends GraphicsProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2267694190077033650L;

	public void run() {
		CampBatalla camp = new CampBatalla(this);
		setSize(1300,400);
		camp.camp();
		
		
		
		
		
	}

}
