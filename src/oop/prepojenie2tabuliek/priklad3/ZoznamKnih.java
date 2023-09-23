package oop.prepojenie2tabuliek.priklad3;

import java.util.ArrayList;

// TODO Vytvorit metody, ktorymi budeme naplnat knihy do zoznamu knih a vypisanie vsetkych knih
public class ZoznamKnih implements IZoznamKnih {

    //private ArrayList<Kniha> zoznamKnih;

    @Override
    public void pridajKnihu(ArrayList<Kniha> knihy, Kniha kniha) {
        knihy.add(kniha);
    }

    @Override
    public void vypisVsetkyKnihy(ArrayList<Kniha> knihy) {
        for (Kniha konkretnaKniha:knihy) {
            System.out.println(konkretnaKniha);
        }
    }

}
