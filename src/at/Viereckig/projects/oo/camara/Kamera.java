package at.Viereckig.projects.oo.camara;

import java.util.ArrayList;

import at.Viereckig.projects.oo.musicbox.Title;

public class Kamera {
	private Hersteller hersteller;
	private Objektiv objektiv;
	private SdKarte sdcard;
	private int pixel;
	private int weight;
	private String color;
	private int setting;
	
	public Kamera(int pixel, int weight, String color, String setting) {
		
		
		this.pixel = pixel;
		this.weight = weight;
		this.color = color;
		
		if(setting=="klein")
			this.setting = 0;
		else if (setting=="mittel")
			this.setting = 1;
		else if (setting=="groß")
			this.setting = 2;
		else
			System.out.println("Dies ist eine Ungültige eingabe Bitte verwenden Sie klein, mittel oder groß!");
	}

	
	
	
	
	
	
	public Hersteller getHersteller() {
		return hersteller;
	}


	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}



	public Objektiv getObjektiv() {
		return objektiv;
	}

	public void setObjektiv(Objektiv objektiv) {
		this.objektiv = objektiv;
	}







	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		if(setting=="klein")
			this.setting = 0;
		else if (setting=="mittel")
			this.setting = 1;
		else if (setting=="groß")
			this.setting = 2;
		else
			System.out.println("Dies ist eine Ungültige eingabe Bitte verwenden Sie klein, mittel oder groß!");
	}

	
	
	
}
