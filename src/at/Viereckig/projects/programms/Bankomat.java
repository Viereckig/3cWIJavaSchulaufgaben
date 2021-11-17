package at.Viereckig.projects.programms;
import java.util.Random;
import java.util.Scanner;


public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float bal = 100;
        boolean finish = true;
        System.out.println("Was möchten Sie tätigen:\n" +
                "1. Einzahlen \n" +
                "2. Abheben \n" +
                "3. Kontostand \n" +
                "4. Beenden \n" +
                "5. Ausrauben\n");
        while (finish) {
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Was für einen Betrag möchten Sie Einzahlen?");
                    float plus = scanner.nextFloat();
                    if (plus > 0)
                        if (plus < 10000) {
                            bal = bal + plus;
                            System.out.println("Sie haben " + plus + " Euro zu Ihrem Konto hinzugefügt!\n");
                        } else
                            System.out.println("Bei so hochen Summen sollten Sie zuerst mit Ihrem Bankberater reden\n");
                    else
                        System.out.println("Sie k�nnen nicht nichts einzahlen!");

                    break;

                case 2:
                    System.out.println("Was für einen Betrag möchten Sie Abheben?");
                    float minus = scanner.nextFloat();
                    if (bal > minus) {
                        if (minus < 10000){
                            bal = bal - minus;
                            System.out.println("Sie haben " + minus + " Euro von Ihrem Konto abgehoben!\n");
                        } else
                            System.out.println("Bei so hochen Summen sollten Sie zuerst mit Ihrem Bankberater reden");
                    }
                    else
                        System.out.println("Geh arbeiten und versuch nicht deine Bank zu betrügen!\n");
                    break;

                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + bal + " Euro!\n");
                    break;

                case 4:
                    finish = false;
                    break;

                case 5:
                    Random random = new Random();
                    boolean randomboolean = random.nextBoolean();
                    int randomnumber = random.nextInt(1000);

                    if (randomboolean) {
                        bal = bal + randomnumber;
                        System.out.println("Sie haben erfolgreich " + randomnumber + " Euro ausgeraubt!\n");
                    } else {
                        System.out.println("Sie wurden erwischt und müssen eine strafe von " + randomnumber + " Euro bezahlen!\n");
                        bal = bal - randomnumber;
                    }

            }
        }
    }
}
