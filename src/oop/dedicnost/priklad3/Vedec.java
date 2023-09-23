package oop.dedicnost.priklad3;

public class Vedec extends Clovek {
    public Vedec(double vyska, double hmotnost) {
        super(vyska, hmotnost);
    }

    public void skuma() {
        System.out.println("Skúmam");
    }
    public void objavuje() {
        System.out.println("Objavuje");
    }
}
