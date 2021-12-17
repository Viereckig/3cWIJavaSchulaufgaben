package at.Viereckig.projects.oo.musicbox;

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
			System.out.println("1 -> Zeigt alle Platten");
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
					String input = scanner.next();
					Record record = (Record) input;
					magazin.loadRecord(record);
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					System.out.println(box.getSumOfMusic());
					break;
			}
		}
	}
}
