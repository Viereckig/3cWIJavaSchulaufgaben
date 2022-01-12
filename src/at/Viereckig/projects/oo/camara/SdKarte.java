package at.Viereckig.projects.oo.camara;

import java.util.ArrayList;

import at.Viereckig.projects.oo.musicbox.Title;

public class SdKarte {
	private int capacy;
	ArrayList<Fotos> fotos = new ArrayList();
	
	public SdKarte(int capacy) {
		this.capacy = capacy;
	}

	public int getCapacy() {
		return capacy;
	}

	public void setCapacy(int capacy) {
		this.capacy = capacy;
	}

	public ArrayList<Fotos> getFotos() {
		return fotos;
	}

	public void addFotos(Fotos fotos) {
		this.fotos.add(fotos);
	}
	
	
}
