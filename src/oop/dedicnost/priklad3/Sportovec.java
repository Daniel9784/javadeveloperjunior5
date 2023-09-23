package oop.dedicnost.priklad3;

public class Sportovec extends Clovek {
    public Sportovec(double vyska, double hmotnost) {
        super(vyska, hmotnost);
    }

    public void maKondicku() {
        System.out.println("Má kondičku");
    }
    public void trenuje() {
        System.out.println("Trénuje");
    }
}
