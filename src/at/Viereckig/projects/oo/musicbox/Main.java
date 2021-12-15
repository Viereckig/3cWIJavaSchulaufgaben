package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Magazin magazine = new Magazin();
		
		Record rec1 = new Record("Ages of love");
		Record rec2 = new Record("Strengh");
		Record rec3 = new Record("james");
		
		
		
		Title t1 = new Title("Love",1);
		Title t2 = new Title("Break",5);
		Title t3 = new Title("Toxic",10);
		Title t4 = new Title("Love",323400);
		Title t5 = new Title("Love",567300);
		Title t6 = new Title("Love",90300);
		Title t7 = new Title("Love",11300);
		Title t8 = new Title("Love",33300);
		Title t9 = new Title("Love",5300);
	
	
		
		rec1.addTitle(t1);
		rec1.addTitle(t2);
		rec1.addTitle(t3);
		
		rec2.addTitle(t4);
		rec2.addTitle(t5);
		rec2.addTitle(t6);
		
		rec3.addTitle(t7);
		rec3.addTitle(t8);
		rec3.addTitle(t9);
		
		
		magazine.addRecords(rec1);
		magazine.addRecords(rec2);
		magazine.addRecords(rec3);
		
		
		Box box = new Box();
		
		List<Record> foundTitle = magazine.findrecord("Break");
		for (Record record : foundTitle) {
			System.out.println(record.getName());
		}
		
		
		
		System.out.println(rec1.getTitels(0));
		
		
		magazine.loadRecord(rec1);
		magazine.play(2);

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