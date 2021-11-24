package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
	}
	
	public static List<Record> getRecords(){
		Title t1 = new Title("Love",300);
		Title t2 = new Title("Love",300);
		Title t3 = new Title("Love",300);
	
	
		//Record rec = new Record("Ages");
		//rec.addTitle(t1)
		
		return new ArrayList<Record>();
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