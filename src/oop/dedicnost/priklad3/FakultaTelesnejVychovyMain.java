package oop.dedicnost.priklad3;

public class FakultaTelesnejVychovyMain {
    public static void main(String[] args) {
        // Vytvorili sme sportovca c.1
        Sportovec jozko = new Sportovec(180, 80);
        jozko.maKondicku();
        jozko.trenuje();
        jozko.bezi();
        jozko.lieta();

        jozko.vypisVyska();
        jozko.vypisHmotnost();

/*        jozko.hmotnost = 80;
        jozko.vyska = 180;*/
/*        System.out.println("Hmotnosť Jožka je: " + jozko.hmotnost);
        System.out.println("Výška Jožka je: " + jozko.vyska);*/

        // Vytvorili sme sportovca c.2
        /*Sportovec zuzka = new Sportovec(170, 50);
        zuzka.kraca();
        zuzka.trenuje();
*//*        zuzka.vyska = 170;
        zuzka.hmotnost = 50;*//*
        zuzka.vypisHmotnost();
        zuzka.vypisVyska();
        zuzka.lieta();

        // Vytvorili sme vedca c.1
        Vedec ivana = new Vedec(165, 48);
        ivana.objavuje();
        ivana.skuma();
*//*        ivana.vyska = 165;
        ivana.hmotnost = 48;*//*
        ivana.vypisHmotnost();
        ivana.vypisVyska();
        ivana.lieta();*/
    }
}
