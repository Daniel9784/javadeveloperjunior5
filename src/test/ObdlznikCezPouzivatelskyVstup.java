package test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí, ináč beží do “nekonečna”.
        Program po spustení zobrazí menu položky, ktoré môžu vyzerať nasledovne:
        Vítam Ťa v programe na výpočet obvodu a obsahu obdĺžnika. Zadaj jednu s nasledujúcich možností:
        (s)tart = pre zadanie strán a, b a následný výpočet obsahu / obvodu
        (q)uit = ukončenie programu
*/

public class ObdlznikCezPouzivatelskyVstup {
    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }
    public static double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner skener = new Scanner(System.in); // Inicializujeme skener pre pouzivatelsky vstup
            System.out.println("""
                    Vítam Ťa v programe na výpočet obvodu a obsahu obdĺžnika. Zadaj jednu s nasledujúcich možností:
                            (s)tart = pre zadanie strán a, b a následný výpočet obsahu / obvodu
                            (q)uit = ukončenie programu
                    """);
            String vstup = skener.nextLine(); // Vstup pre konkretny vyber s alebo q

            if (vstup.equals("s")) {
                System.out.println("Zadaj stranu a");
                double a = skener.nextDouble();
                System.out.println("Zadaj stranu b");
                double b = skener.nextDouble();
                System.out.println("Obvod obdĺžnika je: " + vypocitajObvod(a, b));
                System.out.println("Obsah obdĺžnika je: " + vypocitajObsah(a, b));
            } else if (vstup.equals("q")) break;
        }
    }

    @Test
    public void testVypocitajObvod() {
        assertEquals(10, vypocitajObvod(2, 3));
        assertEquals(10, vypocitajObvod(1.5, 3.5));
        assertEquals(2, vypocitajObvod(0.9, 0.1));
    }

    @Test
    public void testVypocitajObsah() {
        assertEquals(20, vypocitajObsah(2, 10));
        assertEquals(8, vypocitajObsah(2, 4));
    }


}
