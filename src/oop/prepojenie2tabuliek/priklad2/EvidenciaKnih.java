package oop.prepojenie2tabuliek.priklad2;

import java.time.LocalDate;
import java.util.ArrayList;

public class EvidenciaKnih {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha("Já robot", 1960, new Autor("Isaac", "Asimov", LocalDate.of(1900, 8, 26)));
        System.out.println(kniha1);


        Kniha kniha2 = new Kniha(null, 0, null); // Vytvorili sme kniha2 naplnenim null, resp. 0
        kniha2.setNazov("Duna"); // A udaje naplnili volanim jednotlivych setterov
        kniha2.setRokVydania(1970);
        Autor autor2 = new Autor("Frank", "Herbert", LocalDate.of(1910, 9, 28)); // Vytvaram autor2 pre kniha2
        kniha2.setAutor(autor2);
        //System.out.println(kniha2); // Vypise obsah objektu, pretoze trieda obsahuje metodu toString()
        System.out.println("Názov knihy: " + kniha2.getNazov());
        System.out.println("Rok vydania: " + kniha2.getRokVydania());
        System.out.println("Meno autora: " + kniha2.getAutor().getMeno());
        System.out.println("Priezvisko autora: " + kniha2.getAutor().getPriezvisko());
        System.out.println("Dátum narodenia autora: " + kniha2.getAutor().getDatumNarodenia());


        Kniha kniha3 = new Kniha();
        kniha3.setNazov("Java pre začiatočníkov");
        kniha3.setRokVydania(2000);
        kniha3.setAutor(new Autor("Ján", "Žitniak", LocalDate.of(2000, 1, 20)));
        //System.out.println(kniha3);
        System.out.println("Názov knihy: " + kniha3.getNazov());
        System.out.println("Rok vydania: " + kniha3.getRokVydania());
        System.out.println("Meno autora: " + kniha3.getAutor().getMeno());
        System.out.println("Priezvisko autora: " + kniha3.getAutor().getPriezvisko());
        System.out.println("Dátum narodenia autora: " + kniha3.getAutor().getDatumNarodenia());


        // Vytvarame dynamicke pole, teda ArrayList so zoznamom knih
        //ArrayList<Kniha> zoznamKnih = new ArrayList<>();
        var zoznamKnih = new ArrayList<Kniha>();
        zoznamKnih.add(kniha1);
        zoznamKnih.add(kniha2);
        zoznamKnih.add(kniha3);

        // Vypis knihy, ktore su v zozname knih
        System.out.println("\nZoznam všetkých kníh v zozname kníh");
        System.out.println("-----------------------------------");
        for (Kniha konkretnaKniha:zoznamKnih) {
/*            System.out.println("Názov knihy: " + konkretnaKniha.getNazov());
            System.out.println("Rok vydania: " + konkretnaKniha.getRokVydania());
            System.out.println("Meno autora: " + konkretnaKniha.getAutor().getMeno());
            System.out.println("Priezvisko autora: " + konkretnaKniha.getAutor().getPriezvisko());
            System.out.println("Dátum narodenia autora: " + konkretnaKniha.getAutor().getDatumNarodenia());*/
            System.out.println(konkretnaKniha);
        }

    }
}
