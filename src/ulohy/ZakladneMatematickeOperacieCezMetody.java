package ulohy;
// TODO Vytvorte metody obdobnym sposobom aj pre odcitanie, nasobenie, delenie a modulo
public class ZakladneMatematickeOperacieCezMetody {
    public static double scitanie(double cislo1, double cislo2) {
        double sucet = cislo1 + cislo2;
        return sucet;
        //return cislo1 + cislo2; // Alternativny, resp. efektivny sposob vypoctu spolu s jeho vratenim
    }

    public static double odcitanie(double cislo1, double cislo2) {
        return cislo1 - cislo2;
    }

    public static double nasobenie(double cislo1, double cislo2) {
        return cislo1 * cislo2;
    }

    public static double delenie(double cislo1, double cislo2) {
        return cislo1 / cislo2;
    }

    public static double modulo(double cislo1, double cislo2) {
        return cislo1 % cislo2;
    }

    public static void vypis(String operacia, double cislo1, double cislo2, double vysledok) {
        // TODO Zobraz vystupny text tak, aby bol zarovnany na 10 znakov zlava
        // Na odsadenie textu napr. 10 znakov zlava sme pouzili %-10s, k tomu sme vsak museli pridat dalsi argument, resp. prazdny text, ktory je reprezentovany ""
        System.out.printf("%s 2 čísiel %.1f a %.1f je: %.1f%n", operacia, cislo1, cislo2, vysledok);
    }

    public static void main(String[] args) {
        double cislo1 = 8, cislo2 = 2.5;
        //scitanie(cislo1, cislo2); // Tu sa metoda zavola a vykona, ale nezobrazi vysledok pretoze neobsahuje napr. println alebo printf
/*        System.out.println("Súčet 2 čísiel je: " + scitanie(cislo1, cislo2));
        System.out.printf("Súčet 2 čísiel %.1f a %.1f je: %.1f", cislo1, cislo2, scitanie(cislo1, cislo2));
        System.out.printf("Rozdiel 2 čísiel %.1f a %.1f je: %.1f", cislo1, cislo2, odcitanie(cislo1, cislo2));
        System.out.printf("Násobenie 2 čísiel %.1f a %.1f je: %.1f", cislo1, cislo2, nasobenie(cislo1, cislo2));
        System.out.printf("Delenie 2 čísiel %.1f a %.1f je: %.1f", cislo1, cislo2, delenie(cislo1, cislo2));
        System.out.printf("Modulo (zvyšok po delení) 2 čísiel %.1f a %.1f je: %.1f", cislo1, cislo2, modulo(cislo1, cislo2));*/

        // Vypis vysledkov matematickych operacii volanim metody vypis
        vypis("Súčet", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Rozdiel", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Súčin", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Podiel", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo (resp. zvyšok po delení)", cislo1, cislo2, modulo(cislo1, cislo2));
    }
}
