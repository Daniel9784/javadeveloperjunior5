import java.util.Date;

public class PremenneCezVar {
    public static void main(String[] args) {
        var meno = "Ján";
        var priezvisko = "Žitniak";
        var menoPriezvisko = meno + " " + priezvisko;
        System.out.println("Moje meno a priezvisko je: " + menoPriezvisko);

        var a = 10;
        var b = 20;
        var c = "30";
        var sucet = a + b;
        var sucet3cisiel = a + b + c;

        System.out.println("Súčet a b je: " + (a + b));
        System.out.println("Súčet a b je: " + sucet);
        System.out.println("Súčet 3 čísiel, z toho 1 čislo je text: " + sucet3cisiel);

        var aktualnyDatum = new Date();
        System.out.println("Aktuálny dátum a čas je: " + aktualnyDatum);
    }
}
