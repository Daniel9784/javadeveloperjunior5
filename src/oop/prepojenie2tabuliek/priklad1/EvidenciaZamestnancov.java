package oop.prepojenie2tabuliek.priklad1;

import java.time.LocalDate;

public class EvidenciaZamestnancov {
    public static void main(String[] args) {
        Zamestnanec janko = new Zamestnanec("Ján", "Žitniak", LocalDate.of(2000, 12, 31), new Zamestnavatel("Google", "Hlavná ulica 3", "Bratislava", "831 01"));
        System.out.println(janko); // Vypisanie zamestnanca so vsetkymi, aj detailnymi udajmi
        System.out.println("Meno zamestnanca: " + janko.getMeno());
        System.out.println("Priezvisko zamestnanca: " + janko.getPriezvisko());

        janko.setMeno("Juraj");
        System.out.println(janko);
    }
}
