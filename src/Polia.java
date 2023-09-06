public class Polia {
    public static void main(String[] args) {
        // Deklaria pola s nazvom znackyAut, ktore obsahuje 4 znacky
        String znackyAut[] = {"Volvo", "BMW", "Ford", "Mazda"};

        // Vypis prvu znacku
        System.out.println(znackyAut[0]);

        // Vypis poslednu znacku
        System.out.println(znackyAut[3]);

        // Zmena znacky prveho auta
        znackyAut[0] = "Opel";
        // A vypis tuto zmenu
        System.out.println(znackyAut[0]);

        // Pocet vsetkych znaciek aut v poli je
        System.out.println(znackyAut.length);

        // Vypis vsetky znacky aut v poli
        System.out.println("Vypíše všetky značky áut:");
        System.out.println("-------------------------");
        // Pouzijeme cyklus s pevnym poctom opakovani a prikazu length, ktory zistuje dlzku pola
        for (int i = 0; i < znackyAut.length; i++) {
            System.out.println(znackyAut[i]);
            // mozeme v cykle vykonat aj viacero prikazov
        }

        System.out.println();
        // Vypis vsetky znacky aut v poli cez foreach
        System.out.println("Vypíše všetky značky áut cez foreach:");
        System.out.println("-----------------------------------");
        for (String konkretnaZnacka:znackyAut) {
            System.out.println(konkretnaZnacka);
        }

        System.out.println("\nInicializacia pola s konkretnym poctom prkov");
        // TODO Doplnte dalsiu znacku do znackyAut - toto nie je take jednoduche a priamociare
        int [] cisla = new int[8]; // Inicializacia statickeho pola s 8-mi prvkami
        cisla[0] = 10;
        System.out.println(cisla[0]);
        System.out.println(cisla[1]);
    }
}
