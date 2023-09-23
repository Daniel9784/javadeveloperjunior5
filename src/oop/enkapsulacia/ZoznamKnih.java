package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnih {
    public static void main(String[] args) {
        // Vytvorenie prvej knihy
        Kniha kniha1 = new Kniha(); // Vytvorili sme objekt (alebo instanciu triedy) s nazvom kniha1
        kniha1.nazov = "Java";
        kniha1.autor = "Ján Žitniak";
        kniha1.cena = 2.30;
        kniha1.rokVydania = 1999;

        // Ako vypisovat obsah kniha1
        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Autor knihy: " + kniha1.autor);
        System.out.println("Cena knihy: " + kniha1.cena);
        System.out.println("Rok vydania: " + kniha1.rokVydania);

        System.out.println(); // Prazdny riadok

        // Vytvorenie druhej knihy
        Kniha kniha2 = new Kniha(); // Vytvorili sme dalsi objekt knihy
        kniha2.nazov = "Já, robot";
        kniha2.autor = "Isaac Asimov";

        // Ako vypisovat obsah kniha2
        System.out.println("Názov knihy: " + kniha2.nazov);
        System.out.println("Autor knihy: " + kniha2.autor);

        // ZoznamKnih ulozime do ArrayList-u
        ArrayList<Kniha> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        System.out.println("Vypisujem zoznam všetkých kníh v ArrayList-e");
        // Vypisanie obsahu knih
        // System.out.println(knihy); // Vypise pre cloveka nezromitelny text ako napr. [oop.enkapsulacia.Kniha@1be6f5c3, oop.enkapsulacia.Kniha@6b884d57]
        for(Kniha knihaObjekt:knihy) {
            // System.out.println(knihaObjekt); // Vypise pre cloveka nezrozumitelny text ako napr. oop.enkapsulacia.Kniha@1be6f5c3 a oop.enkapsulacia.Kniha@6b884d57
            System.out.println(); // Prazdny riadok
            System.out.println("Názov knihy: " + knihaObjekt.nazov);
            System.out.println("Autora knihy: " + knihaObjekt.autor);
            System.out.println("Cena knihy: " + knihaObjekt.cena);
            System.out.println("Rok vydania knihy: " + knihaObjekt.rokVydania);
        }


    }
}
