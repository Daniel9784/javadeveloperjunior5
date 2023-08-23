package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class PriradenieZnamkyUkoncenieCezPrikazQ {
    public static void main(String[] args) {
        while (true) { // Nekonecny cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj počet bodov:");
            String pocetBodov = skener.nextLine(); // nextLine je pre akykolvek String, cize text, ale aj cislo sa v tomto pripade berie ako text

            // Akym sposobom ukoncit while. Hint: vpisanim pismena q
            if (pocetBodov.equals("q") || pocetBodov.equals("Q")) break;
            try {
                int pocetBodovAkoInt = Integer.parseInt(pocetBodov);
                if (pocetBodovAkoInt > 90) System.out.println("Tvoja známka je A");
                else if (pocetBodovAkoInt > 75) System.out.println("Tvoja známka je B");
                else if (pocetBodovAkoInt > 65) System.out.println("Tvoja známka je C");
                else System.out.println("Neviem priradiť známku k danému počtu bodov");
            } catch (NumberFormatException e) {
                System.out.println("Akceptovateľné pismeno, resp. znak je q alebo Q na ukončenie programu");
            }
        }
    }
}
