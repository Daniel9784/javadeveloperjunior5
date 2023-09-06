import java.util.ArrayList;
import java.util.Collections;

//https://www.w3schools.com/java/java_arraylist.asp
public class DynamickePolia {
    public static void main(String[] args) {
        ArrayList<String> auta = new ArrayList<>();
        auta.add("Volvo");
        auta.add("BMW");
        auta.add("Ford");
        auta.add("Mazda");
        auta.add("Škoda");

        // Vypis prvej polozky (cize je to v podstate index 0)
        System.out.println(auta.get(0));

        // Zmena znacky prveho auta na Opel
        auta.set(0, "Opel");

        // Vypis prvej polozky po zmene (cize je to v podstate index 0)
        System.out.println(auta.get(0));

        // Odstranenie prvej polozky dynamickeho pola
        auta.remove(0);

        // Odstranenie vsetkych poloziek v ArrayList
        // auta.clear();

        System.out.println("Veľkosť poľa je: " + auta.size());

        System.out.println("\nVypíš všetky autá cez for-each:");
//        System.out.println(auta);
        for (String konkretneAuto:auta) {
            System.out.print(konkretneAuto + "\t");
        }

        System.out.println(); // Prazdny riadok

        System.out.println("\nVypíš všetky autá cez for:");
        for (int i = 0; i < auta.size(); i++) {
            System.out.print(auta.get(i) + "\t");
        }

        ArrayList<Integer> dynamickePoleCisiel = new ArrayList<>();
        dynamickePoleCisiel.add(20);
        dynamickePoleCisiel.add(4);
        dynamickePoleCisiel.add(5);

        System.out.println(); // Prazdny riadok

        System.out.println("\nVypíš všetky celé čísla");
        for(Integer konkretneCislo:dynamickePoleCisiel)
            System.out.println(konkretneCislo);

        Collections.sort(dynamickePoleCisiel);
        System.out.println(dynamickePoleCisiel);

    }
}
