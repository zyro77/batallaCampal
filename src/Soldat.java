import acm.graphics.GImage;


public class Soldat {
	
	private GImage imatge;
	
	public Soldat(double x,double y,GImage nomFitxer){
		this.imatge = nomFitxer;
		imatge.setLocation(x,y);
	}

	public double getX() {
		return imatge.getX();
	}
	
	public void setX(double x) {
		this.imatge.setLocation(x,imatge.getY());
	}

	public GImage getImatge() {
		return imatge;
	}

	public void setImatge(GImage imatge) {
		this.imatge = imatge;
	}

	public double getY() {
		return imatge.getY();
	}

	public void setY(int y) {
		this.imatge.setLocation(imatge.getX(),y);
	}

	
	
}
