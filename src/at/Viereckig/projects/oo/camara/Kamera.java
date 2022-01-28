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

	
	
	public  void doFoto(){
		int size = getSetting();
		if(this.getSdcard().getCapacy() >= this.getSdcard().checkcapacy() + this.getGbOfSetting(this.getSetting())) {
			Fotos f1 = new Fotos(size);
			sdcard.addFotos(f1);
		}else
			System.out.println("SD Karte ist zu voll für dieses Foto! Sie haben nur noch " + (this.getSdcard().getCapacy()-this.getSdcard().checkcapacy()) + "GB Speicher zur Verfügung!");
		
		if(this.getSdcard().getCapacy()-this.getSdcard().checkcapacy() == 2)
			System.out.println("Sie haben auf der SDKarte nur noch Speicher für ein einziges kleines Foto platz!");
		if(this.getSdcard().getCapacy()-this.getSdcard().checkcapacy() == 4)
			System.out.println("Sie haben auf der SDKarte nur noch Speicher für ein einziges mittleres Foto platz!");
		if(this.getSdcard().getCapacy()-this.getSdcard().checkcapacy() == 8)
			System.out.println("Sie haben auf der SDKarte nur noch Speicher für ein einziges großes Foto platz!");
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




	


	public SdKarte getSdcard() {
		return sdcard;
	}

	
	public void setSdcard(SdKarte sdcard) {
		this.sdcard = sdcard;
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

	int getGbOfSetting(int setting) {
		int gb = 0;
		if(setting==0)
			gb = 2;
		else if (setting==1)
			gb = 4;
		else if (setting==2)
			gb = 6;
		
		return gb;
	}
	
	
}
