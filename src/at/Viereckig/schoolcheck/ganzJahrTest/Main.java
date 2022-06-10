package at.Viereckig.schoolcheck.ganzJahrTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WaterTank waterTank = new WaterTank();
		BeanStorage beanStorage = new BeanStorage();
		CoffeeMachine coffeeMachine = new CoffeeMachine("Quickmill 3000", waterTank, beanStorage);
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("1. Kaffeemaschine Einschalten");
			System.out.println("2. Gr��e des Kaffees einstellen");
			System.out.println("3. St�rke des Kaffees einstellen");
			System.out.println("4. Wasser der Kaffemaschine auff�llen");
			System.out.println("5. Bohnen der Kaffemaschine auff�llen");
			System.out.println("6. Kaffee rauslassen");
			System.out.println("7. Aktuelle Einstellungen und Daten auslesen");
			System.out.println("8. Kaffeemaschine Ausschalten");
			System.out.println();
			System.out.println();
			
			
			
			System.out.println("Bitte Ausw�hlen welche Option Sie t�tigen wollen:");
			int selection = scanner.nextInt();
			
			switch(selection){
	        case 1:
	            coffeeMachine.turnOn();
	            System.out.println("Die Kaffeemaschine wurde eingeschalten!");
	            break;
	        case 2:
	            System.out.println("Gew�nschte Gr��e eingeben (von 40ml bis zu 200ml)");
	            int sizeSelect = scanner.nextInt();
	            coffeeMachine.setSize(sizeSelect);
	            System.out.println("Einstellung der Gr��e wurde auf " + sizeSelect + "ml gesetzt");
	            break;
	        case 3:
	        	System.out.println("Gew�nschte St�rke eingeben (von Stufe 1 bis Stufe 10)");
	            int strenghSelect = scanner.nextInt();
	            coffeeMachine.setStrengh(strenghSelect);
	            System.out.println("Einstellung der St�rke wurde auf " + strenghSelect + " gesetzt");
	            break;
	        case 4:
	            waterTank.reFill();
	            System.out.println("Wassertank wurde aufgef�llt!");
	            break;
	        case 5:
	            beanStorage.reFill();
	            System.out.println("Bohnen wurden aufgef�llt!");
	            break;
	        case 6:
	            coffeeMachine.getCoffee();
	            break;
	        case 7:
	            System.out.println();
	            System.out.println();
	            System.out.println("Im Wasser Tank ist noch "+waterTank.getCapacy()+ "ml Wasser");
	            System.out.println("Im Bohnen Tank sind noch "+beanStorage.getCapacy()+ " Bohnen");
	            System.out.println("Es ist eine Kaffegr��e von "+ coffeeMachine.getSize() + "ml eingestellt");
	            System.out.println("Es ist eine Kaffest�rke von "+ coffeeMachine.getStrengh() + " eingestellt");
	            break;
	        case 8:
	        	coffeeMachine.turnOff();
	            System.out.println("Die Kaffeemaschine wurde ausgeschalten!");
	            break;
	        }
			
		}
		
	
	}
}
