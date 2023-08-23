package ulohy;

/*
Úloha č.1: Príklad na prácu s premennými
        Vypíšte do konzoly nasledujúci text:
        Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
        V Bratislave dňa 18.06.2022
        Poznámka: Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).
*/


import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.format.*;
import java.util.Date;


public class PremenneUloha {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        
        String meno = "Jozef";
        String priezvisko = "Mrkvička";
        String celeMeno = meno + " " + priezvisko ;
        int den = 03;
        int mesiac = 04;
        int rok = 2000;
        float myFloatNum = 1.5f;

        int denZapisu = 18;
        int mesiacZapisu = 06;
        int rokZapisu = 2022;


        System.out.println(ANSI_RED + "Študent " + celeMeno + ANSI_YELLOW + ", z maturitnej skúšky má známku " +  myFloatNum + " od septembra 2022 nastúpi do nového zamestnania ako Java programátor." + ANSI_RESET);
        System.out.println("\nV Bratislave dňa " + denZapisu + "." + mesiacZapisu +"."+ rokZapisu );

        // Zastaraly sposob ako zistit aktualny datum
        Date datum = new Date(); // Tymto prikazom sme vytvorili aktualny datum, format je ale anglosasky
        System.out.println("Aktuálny dátum + čas v anglosaskom, resp. systémovom formáte: " + datum);

        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");
        String aktualnyDatumSKFormat = formatDatumu.format(datum);

        System.out.println("Aktuálny dátum preformátovaný na slovenský formát: " + aktualnyDatumSKFormat);

        // Vytvorenie akehokolvek dataumu, "po starom"
        Date nejakyDatum = new Date(2023, 7, 21);
        System.out.println("\n\n");
        System.out.println("\n\nKonkrétny dátum cez Date: " + nejakyDatum);
        System.out.println("\n\n");

        // Moderny sposob ako zistit aktualny datum
        LocalDate aktualnyDatum = LocalDate.now();
        System.out.println("Aktuálny dátum moderným spôsobom v systémovom formáte je: " + aktualnyDatum);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = aktualnyDatum.format(dtf);
        System.out.println("Aktuálny dátum moderným spôsobom v slovenskom formáte je: " + formattedDate);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate datumNarodenia = LocalDate.of(2000, 3, 4); // Konkretny datum
        String naformatovanyDatumNarodeniaSk = datumNarodenia.format(dtf1);
        System.out.println("Dátum narodenia študenta v slovenskom formáte je: " + naformatovanyDatumNarodeniaSk);
    }
}

