package at.Viereckig.projects.oo.camara;

public class Main {
	public static void main(String[] args) {
		Kamera camara = new Kamera(100000, 500, "green", "klein");
		SdKarte sd1 = new SdKarte(16);
		
		Hersteller h1 = new Hersteller("Sony", "Japan");
		Hersteller h2 = new Hersteller("Canon", "China");
		Hersteller h3 = new Hersteller("Tameron", "Japan");
		
		Objektiv o1 = new Objektiv(300, h3);
		Objektiv o2 = new Objektiv(500, h3);
		Objektiv o3 = new Objektiv(100, h3);
		
		camara.setObjektiv(o1);
		camara.setHersteller(h1);
		
		
	}
}

/*
Kamera hat Eigenschaften (Pixel, Gewicht, Farbe etc.)
Kamera hat Hersteller (Name, Land)
auf Kamera kann ein Objektiv gesetzt werden
Objektiv hat Hersteller und eine Brennweite
In Kamera kann SD-Karte gesteckt werden.
SD Karte merkt sich Fotos und hat Kapazität (z.B. 16 GB)
Kamera merkt sich aktuellen Settings wie Auflösung der Fotos (klein 2GB, mittel 4GB, groß 8GB).

*/