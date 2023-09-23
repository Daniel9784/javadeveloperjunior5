package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihSpravne {
    public static void main(String[] args) {
        KnihaSpravne kniha1 = new KnihaSpravne(); // Vytvorili sme objekt (instanciu triedy) Kniha
        kniha1.setNazov("Java");
        kniha1.setAutor("Ján Žitniak");
        kniha1.setRokVydania(2000);
        kniha1.setCena(3.09);

        System.out.println("Vypíš detail knihy č.1:");
        System.out.println("-------------------");
        System.out.println("Názov knihy: " + kniha1.getNazov());
        System.out.println("Autor knihy: " + kniha1.getAutor());
        System.out.println("Cena knihy: " + kniha1.getCena());
        System.out.println("Rok vydania knihy: " + kniha1.getRokVydania());

        System.out.println(); // Prazdny riadok

        KnihaSpravne kniha2 = new KnihaSpravne();
        kniha2.setNazov("Já, robot");
        kniha2.setAutor("Isaac Asimov");
        System.out.println("Vypíš detail knihy č.2:");
        System.out.println("-------------------");
        System.out.println("Názov knihy: " + kniha2.getNazov());
        System.out.println("Autor knihy: " + kniha2.getAutor());

        // ZoznamKnih ulozime do ArrayList-u
        ArrayList<KnihaSpravne> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        System.out.println("\nVypisujem zoznam všetkých kníh v ArrayList-e");
        System.out.println("--------------------------------------------");
        // Vypisanie obsahu knih
        // System.out.println(knihy); // Vypise pre cloveka nezromitelny text ako napr. [oop.enkapsulacia.Kniha@1be6f5c3, oop.enkapsulacia.Kniha@6b884d57]
        for(KnihaSpravne knihaObjekt:knihy) {
            // System.out.println(knihaObjekt); // Vypise pre cloveka nezrozumitelny text ako napr. oop.enkapsulacia.Kniha@1be6f5c3 a oop.enkapsulacia.Kniha@6b884d57
            System.out.println(); // Prazdny riadok
            System.out.println("Názov knihy: " + knihaObjekt.getNazov());
            System.out.println("Autora knihy: " + knihaObjekt.getAutor());
            System.out.println("Cena knihy: " + knihaObjekt.getCena());
            System.out.println("Rok vydania knihy: " + knihaObjekt.getRokVydania());
        }

    }
}
