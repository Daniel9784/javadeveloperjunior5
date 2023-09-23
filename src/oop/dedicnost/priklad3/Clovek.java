package oop.dedicnost.priklad3;

public class Clovek extends SuperClovek {
    // Atributy triedy
    protected double vyska;
    protected double hmotnost;

    public Clovek(double vyska, double hmotnost) {
        this.vyska = vyska;
        this.hmotnost = hmotnost;
    }

    public void bezi() {
        // Tu by mohla byt zmysluplnejsia implementacia tejto metody
        System.out.println("Beží");
    }
    public void kraca() {
        System.out.println("Kráča");
    }
    public void skace() {
        System.out.println("Skáče");
    }

    public void vypisVyska() {
        System.out.println(this.vyska);
    }

    public void vypisHmotnost() {
        System.out.println(this.hmotnost);
    }
}
