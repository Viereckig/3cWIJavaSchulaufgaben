package at.Viereckig.projects.programms;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
		String[] words = {"Hund", "Vorarlberg", "Donau", "Pinguin"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String hangmanword = words[random.nextInt(words.length)];
    	int leben = 6;
    	char[] word = new char[hangmanword.length()];
    	int[] guess = new int[hangmanword.length()];
    	word = hangmanword.toCharArray();
        System.out.println(hangmanword);
        boolean finish = true;
        
        while(finish) {
            int i = 0;
            String end = null;
        	System.out.print("Das Wort ist ");
        	for (int j = 0; j < hangmanword.length(); j++) {
        		if(guess[j] == 1) {
        			System.out.print(word[j]);
        			end = end + "a";
        		} else
        			System.out.print("*");
        			end = end + "*";
        	}
        	System.out.println("!");
    		System.out.println("Sie haben noch " + leben + " Leben!");
        	System.out.println("Errate einen Buchstaben:");
        	String selection = scanner.next();
        	int pro = 0;
    		for (i = 0; i < word.length; i++) {
                if (word[i] == selection.charAt(0)) {
                	guess[i] = 1;
                	pro = 1;
                }
			}
    		if(pro == 1 ) {
    			System.out.println("Sie haben einen Buchstaben erraten!");
    		} else {
    			System.out.println("Sie haben ein Leben verloren!");
    			leben--;
    		}
		

    		if (!end.contains("*")) {
    			System.out.println("Sie haben Gewonnen!");
    			finish = false;
			}
    		if (leben == 0) {
    			System.out.println("Sie haben verloren!");
    			finish = false;
    		}
        }
	}
}
