package oop.prepojenie2tabuliek.priklad3;

import java.util.ArrayList;

// TODO Vytvorit metody, ktorymi budeme naplnat knihy do zoznamu knih a vypisanie vsetkych knih
public interface IZoznamKnih {
    void pridajKnihu(ArrayList<Kniha> knihy, Kniha kniha);
    void vypisVsetkyKnihy(ArrayList<Kniha> knihy);
}
