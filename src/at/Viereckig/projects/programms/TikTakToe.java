package at.Viereckig.projects.programms;
import java.util.Scanner;

public class TikTakToe {
	static int[] [] feld = new int [3] [3];
	public static void main(String[] args) {
		boolean winner = false;
		int counter = 0;
        Scanner scanner = new Scanner(System.in);
		while(!winner) {
			System.out.println("   1  2  3");
			for(int row = 1; row < 4 ;row++) {
				System.out.print(row + " ");
				for(int collum = 1; collum < 4 ;collum++) {
					switch (feld [row -1] [collum -1]) {
						case 0:
							System.out.print("| |");
							break;
						case 1:
							System.out.print("|x|");
							break;
						case 2:
							System.out.print("|o|");
							break;
					}
				}
				System.out.println();
			}
			int player = counter % 2 +1;
			System.out.println("Player " + player + " is on the turn!");
			String [] insert = new String [2];
			boolean dummheit = true;
			while(dummheit) {
				String selection = scanner.next();
				if(selection.length() == 3) {
					insert = selection.split(",");
					int value1 = Integer.valueOf(insert[0]);
					int value2 = Integer.valueOf(insert[1]);
					if(value1 >= 4 || value2 >= 4 || value1 <= 0 || value2 <= 0) {
						System.out.println("Nur Zahlen von 1 bis 3 eingeben dieses Feld ist nicht größer!");
					} else {
						if(feld[value1-1][value2-1] == 0) {
							feld[value1-1][value2-1] = player;
							dummheit = false;
						} else
							System.out.println("Dieses Feld ist schon belegt!");
					}
				} else
					System.out.println("Falscher Syntax bitte benutze 'reihe,spalte'!");
			}
			counter++;
			winner = winner();
			if (winner())
				System.out.println("Spieler " + player + " hat Gewonnen!");

		}
		
	}
	public static boolean winner() {
		if(feld[0][0] == feld[0][1] && feld[0][0] == feld[0][2] && feld[0][0] != 0)
			return true;
		if(feld[1][0] == feld[1][1] && feld[1][0] == feld[1][2] && feld[1][0] != 0)
			return true;
		if(feld[2][0] == feld[2][1] && feld[2][0] == feld[2][2] && feld[2][0] != 0)
			return true;
		if(feld[0][0] == feld[1][0] && feld[0][0] == feld[2][0] && feld[0][0] != 0)
			return true;
		if(feld[0][1] == feld[1][1] && feld[0][1] == feld[2][1] && feld[0][1] != 0)
			return true;
		if(feld[0][2] == feld[1][2] && feld[0][2] == feld[2][2] && feld[0][2] != 0)
			return true;
		if(feld[0][0] == feld[1][1] && feld[0][0] == feld[2][2] && feld[0][0] != 0)
			return true;
		if(feld[2][0] == feld[1][1] && feld[2][0] == feld[0][2] && feld[2][0] != 0)
			return true;
		return false;
	}
}
