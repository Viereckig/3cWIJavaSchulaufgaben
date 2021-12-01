package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
		Title t1 = new Title("Love",300);
		Title t2 = new Title("Break",4040);
		Title t3 = new Title("Toxic",301230);
		Title t4 = new Title("Love",323400);
		Title t5 = new Title("Love",567300);
		Title t6 = new Title("Love",90300);
		Title t7 = new Title("Love",11300);
		Title t8 = new Title("Love",33300);
		Title t9 = new Title("Love",5300);
	
	
		Record rec1 = new Record("Ages of love");
		rec1.addTitle(t1);
		rec1.addTitle(t2);
		rec1.addTitle(t3);
		
		
		System.out.println(rec1.getTitels(1));
		
		
	}
	
}


/*
Kann 50 platten haben
addRecord(record) 			damit kann platte hinzugefügt werden(wenn schon 50 vorhanden fehler)
removeRecord(record)		damit kann platte entfernt werden
getSumOfMusic()				wird gesamte Spielzeit aller Platten ausgegeben
searchRecord(title)			kann Plate gesucht werden
loadRecord(record)			wird platte in spieler gelegt
play(titelnummer)			wird titel an der stelle abgespielt und gibt es aus
Wird play gestartet ohne eine Platte im Spieler kommt ein Fehler. 
*/