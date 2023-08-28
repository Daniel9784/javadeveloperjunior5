package ucastnici.tono;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;





class Penazenka {
    private double zostatok;

    public Penazenka(double pociatocnyZostatok) {
        this.zostatok = pociatocnyZostatok;
    }

    public double getZostatok() {
        return zostatok;
    }

    public void vlozPeniaze(double suma) {
        if (suma > 0) {
            zostatok += suma;
            System.out.println("Zostatok po vklade: " + zostatok);
        } else {
            System.out.println("Neplatná suma na vklad.");
        }
    }

    public void vyberPeniaze(double suma) {
        if (suma > 0 && suma <= zostatok) {
            zostatok -= suma;
            System.out.println("Zostatok po výbere: " + zostatok);
        } else {
            System.out.println("Nedostatok prostriedkov na účte.");
        }
    }
}





public class FinancnaAplikacia2 {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulozeneHeslo = citajUlozeneHeslo();

        if (ulozeneHeslo == null) {




            // Prvý spustenie, používateľ musí vytvoriť heslo

            System.out.println("Vitajte pri prvom spustení finančnej kalkulačky!");
            System.out.print("Vytvorte si heslo: ");
            String noveHeslo = scanner.nextLine();

            // Uloženie hesla do súboru
            try {
                FileWriter writer = new FileWriter("heslo.txt");
                writer.write(noveHeslo);
                writer.close();
                System.out.println("Heslo bolo úspešne uložené.");
            } catch (IOException e) {
                System.out.println("Chyba pri ukladaní hesla.");
            }





        } else {
            System.out.print("Zadajte heslo: ");
            String zadaneHeslo = scanner.nextLine();

            if (ulozeneHeslo.equals(zadaneHeslo)) {
                System.out.println("Vitajte v finančnej kalkulačke!");
                // Implementujte kód pre finančnú kalkulačku




                System.out.print("Zadajte počiatočný zostatok: ");
                double pociatocnyZostatok = scanner.nextDouble();

                Penazenka penazenka = new Penazenka(pociatocnyZostatok);

                System.out.println("Vaša peňaženka bola vytvorená s pociatocným zostatkom: " + pociatocnyZostatok);

                while (true) {
                    System.out.println("Vyberte operáciu:");
                    System.out.println("1 - Vklad peňazí");
                    System.out.println("2 - Výber peňazí");
                    System.out.println("3 - Zobrazenie zostatku");
                    System.out.println("4 - Zobrazenie histórie transakcií");
                    System.out.println("0 - Ukončiť program");
                    int volba = scanner.nextInt();

                    switch (volba) {
                        case 1:
                            System.out.print("Zadajte sumu na vklad: ");
                            double vkladSuma = scanner.nextDouble();
                            ulozTransakciu("Vklad", vkladSuma);
                            break;
                        case 2:
                            System.out.print("Zadajte sumu na výber: ");
                            double vyberSuma = scanner.nextDouble();
                            ulozTransakciu("Výber", -vyberSuma);
                            break;
                        case 3:
                            double zostatok = citajZostatok();
                            System.out.println("Aktuálny zostatok: " + zostatok);
                            break;
                        case 4:
                            zobrazHistoriuTransakcii();
                            break;
                        case 0:
                            System.out.println("Ďakujeme, že ste použili finančnú kalkulačku.");
                            return;
                        default:
                            System.out.println("Neplatná voľba, skúste znova.");
                    }
                }
            } else {
                System.out.println("Nesprávne heslo. Prístup zamietnutý.");
            }

        }



    }
    private static String citajUlozeneHeslo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("heslo.txt"));
            String line = reader.readLine();
            reader.close();
            return line;
        } catch (IOException e) {
            return null; // Súbor s heslom neexistuje, ešte nebolo vytvorené heslo
        }
    }

    private static void ulozTransakciu(String typ, double suma) {
        try {
            FileWriter writer = new FileWriter("transakcie.txt", true);
            writer.write(typ + ": " + suma + "\n");
            writer.close();
            System.out.println("Transakcia úspešne uložená.");
        } catch (IOException e) {
            System.out.println("Chyba pri ukladaní transakcie.");
        }
    }

    private static double citajZostatok() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("zostatok.txt"));
            double zostatok = Double.parseDouble(reader.readLine());
            reader.close();
            return zostatok;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Chyba pri čítaní zostatkua.");
            return 0.0;
        }
    }

    private static void zobrazHistoriuTransakcii() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transakcie.txt"));
            String riadok;
            while ((riadok = reader.readLine()) != null) {
                System.out.println(riadok);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Chyba pri čítaní histórie transakcií.");
        }
    }
}