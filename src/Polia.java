public class Polia {
    public static void main(String[] args) {
        // Deklaria pola s nazvom cars, ktore obsahuje 4 znacky
        String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};

        // Vypis prvu znacku
        System.out.println(cars[0]);

        // Vypis poslednu znacku
        System.out.println(cars[3]);

        // Zmena znacky prveho auta
        cars[0] = "Opel";
        // A vypis tuto zmenu
        System.out.println(cars[0]);

        // Pocet vsetkych znaciek aut v poli je
        System.out.println(cars.length);

        // Vypis vsetky znacky aut v poli
        System.out.println("Vypíše všetky značky áut:");
        System.out.println("-------------------------");
        // Pouzijeme cyklus s pevnym poctom opakovani a prikazu length, ktory zistuje dlzku pola
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            // mozeme v cykle vykonat aj viacero prikazov
        }
    }
}
