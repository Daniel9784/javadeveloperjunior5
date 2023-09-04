package sk.tmconsulting.pozdravy;

import sk.tmconsulting.pozdravy.anglicky.Hello;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;

/*
TODO Úloha č.2: Vytvorenie metód a ich volanie z centrálnej triedy
        Vo všetkých balíčkoch okrem sk.tmconsulting.pozdravy vytvorte triedy, ktorá sa bude volať Ahoj, Szia, Hallo, Hello. Každá trieda bude mať statickú metódu s názvom pozdravujem(). Daná metóda bude do konzoly vypisovať pozdrav v príslušnom jazyku.
*/
public class VsetkyPozdravy {
    public static void main(String[] args) {
        Hello.pozdravujem();
        Szia.pozdravujem();
        Hallo.pozdravujem();
        Ahoj.pozdravujem();

        System.out.println(); // Prazdny riadok

        // Dynamicke volanie metod
        // Ak chceme volat nestaticke metody, musime najprv vytvorit objekt alebo instanciu triedu
        Hello helloObjekt = new Hello(); // Vytvorenie objektu, resp. instancii triedy Hello
        helloObjekt.pozdravujemDynamicky();

        Szia sziaObjekt = new Szia();
        sziaObjekt.pozdravujemDynamicky();

        Hallo halloObjekt = new Hallo();
        halloObjekt.pozdravujemDynamicky();

        Ahoj ahojObjekt = new Ahoj();
        ahojObjekt.pozdravujemDynamicky();
    }
}
