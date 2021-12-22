package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BoxGUI {
	private Box box;
	
	
	public BoxGUI(Box box) {
	
		this.box = box;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		Magazin magazin = this.box.getMagazin();
		
		
		while(true) {
			System.out.println();
			System.out.println("1 -> Zeigt alle Platten");
			System.out.println("2 -> Legt Platte ein");
			System.out.println("3 -> Wirft Platte wieder raus");
			System.out.println("4 -> Sucht einen Record in dem Titel vorhanden ist");
			System.out.println("5 -> spielt einen Titel ab");
			System.out.println("6 -> zeigt aktuelle eingelegte Platte an");
			System.out.println("7 -> zeigt Summe aller Titel");
			
			int selection = scanner.nextInt();
			switch (selection) {
				case 1:
					for(Record record : magazin.getRecords()) {
						System.out.println(record.getName());
					}
					break;
				case 2:
					System.out.println("Welche Platte möchten Sie einlegen?");
					int nr = scanner.nextInt();
					magazin.loadRecord(magazin.getRecords().get(nr));
					break;
				case 3:
					magazin.unloadRecord();
					System.out.println("Platte wurde erfolgreich Entladen!");
					break;
				case 4:
					String name = scanner.next();
					List<Record> find = new ArrayList();
					find = magazin.findrecord(name);
					for (int i = 0; i<find.size(); i++) {
						System.out.println(find.get(i).getName());
					}
					
					break;
				case 5:
					int nrplay = scanner.nextInt();
					magazin.play(nrplay);
					break;
				case 6:
					if(magazin.getRecordin() != null)
						System.out.println("Es ist gerade "+ magazin.getRecordin().getName() + " eingelegt!");
					else
						System.out.println("Es ist keine Platte eingelegt!");
					break;
				case 7:
					System.out.println("Es sind insgesamt " + box.getSumOfMusic()+ " Minuten!");
					break;
			}
		}
	}
}
