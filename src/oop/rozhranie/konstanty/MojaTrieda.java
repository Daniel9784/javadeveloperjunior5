package oop.rozhranie.konstanty;

interface Konstanty {
    int MAX_POČET = 100; // Su to konstantny
    String DEFAULT_NAZOV = "Štandardné meno";
}

class MojaTrieda implements Konstanty {
    public void vypisKonštanty() {
        System.out.println("Maximálny počet: " + MAX_POČET);
        System.out.println("Predvolený názov: " + DEFAULT_NAZOV);
    }

    public static void main(String[] args) {
        MojaTrieda mojaTriedaObjekt = new MojaTrieda();
        mojaTriedaObjekt.vypisKonštanty();
        // MAX_POČET = 200;
        // mojaTriedaObjekt.MAX_POČET = 200;
    }
}

