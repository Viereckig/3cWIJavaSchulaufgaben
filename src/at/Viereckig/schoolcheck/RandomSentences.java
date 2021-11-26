package at.Viereckig.schoolcheck;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean end = true;
		
		System.out.println();
		
		String[] noun = {"Er", "Sie"};
		String[] verb = {"geht", "l�uft", "f�hrt"};
		String[] location = {"nach Hause", "zur Schule", "ins B�ro", "zur Party"};
		
		while (end) {
			System.out.println("Wie viele S�tze m�chten Sie?");
			System.out.println("Zum Beenden des Programms geben Sie bitte '69'ein!");
			int selection = scanner.nextInt();
			
			if(selection == 69)
				break;
			
			for (int i = 0; i <= Integer.valueOf(selection) ;i++) {
				int nounnummber = random.nextInt(noun.length);
				int verbnummber = random.nextInt(verb.length);
				int locationnummber = random.nextInt(location.length);
				
				System.out.println(noun[nounnummber] + " " + verb[verbnummber] + " " + location[locationnummber]);
				System.out.println();
			}
			
			
		}
		
		
	}
}
