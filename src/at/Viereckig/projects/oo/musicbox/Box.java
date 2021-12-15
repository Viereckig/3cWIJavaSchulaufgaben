package at.Viereckig.projects.oo.musicbox;

import java.util.Scanner;

public class Box {
	private Magazin magazin;
	private Scanner scanner;
	
	
	public void box() {
		Scanner scanner = new Scanner(System.in);
		this.magazin = new Magazin();
	}
	
	public void run() {
		while(true) {
			System.out.println("1 -> Zeigt alle Platten");
			System.out.println("2 -> legt eine Platte ein");
			System.out.println("3 -> nimmt eine Platte wieder raus");
			System.out.println("4 -> Sucht einen Record in dem Titel vorhanden ist");
			System.out.println("5 -> spielt einen Titel ab");
			System.out.println("6 -> zeigt aktuelle eingelegte Platte an");
			
			int selection = this.scanner.nextInt();
			switch (selection) {
				case 1:
					
					
				case 2:	
					
				case 3:
					
				case 4:
					
				case 5:
					
				case 6:
			}
		}
	}
}
