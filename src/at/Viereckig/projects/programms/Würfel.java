package at.Viereckig.projects.programms;
import java.util.Random;
import java.util.Scanner;

public class Würfel {
    public static void main(String[] args) {
        int users = 0;
        int bots = 0;
        for(int i = 5; i >= 0; i--) {
            Random random = new Random();
            System.out.println("Tippen Sie 1 um zu WÃ¼rfeln:");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            if (selection == 1) {
            	int user = random.nextInt(6)+1;
                int bot = random.nextInt(6)+1;
            	users = users + user;
                bots = bots + bot;
                System.out.println("Sie haben " + user + " gewÃ¼rfelt!");
                System.out.println("Nun sind Sie bei einer Summe von " + users + "!");
                System.out.println("Ihr Gegner hat eine Summe von " + bots + "!");
                System.out.println("Sie haben noch " + i + " Würfe!\n");
            }
        }
        if (users > bots) {
        	System.out.println("Sie haben mit " + (users-bots) + " Punkten vorsprung Gewonnen!");
        } else if (bots > users) {
			System.out.println("Der Bot hat mit einem vorsprung von " + (bots-users) + " Punkten Gewonnen!");
		} else {
			System.out.println("Sie haben Gleich viele Punkte wie der Bot!");
		}
    }
}
