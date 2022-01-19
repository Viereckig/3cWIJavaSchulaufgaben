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

	public ArrayList<Fotos> getFotos() {
		return fotos;
	}

	public void addFotos(Fotos foto) {
		this.fotos.add(foto);
	}
	
	public int checkcapacy() {
		int freecapacy = 0;

		for(int i = 0; i <= fotos.size()-1;i++) {
			freecapacy = freecapacy + fotos.get(i).getSize();
		}

		return freecapacy;
	}
}
