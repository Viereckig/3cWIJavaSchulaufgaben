package at.Viereckig.projects.oo.camara;

public class Objektiv {
	private int brennweite;
	private Hersteller hersteller;
	
	public Objektiv(int brennweite, Hersteller hersteller) {
		this.brennweite = brennweite;
		this.hersteller = hersteller;
	}
	
	
	
	public int getBrennweite() {
		return brennweite;
	}

	public void setBrennweite(int brennweite) {
		this.brennweite = brennweite;
	}

	public Hersteller getHersteller() {
		return hersteller;
	}

	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}
	
	
	
}
