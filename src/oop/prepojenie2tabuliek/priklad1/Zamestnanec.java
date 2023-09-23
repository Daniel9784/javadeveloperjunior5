package oop.prepojenie2tabuliek.priklad1;

import java.time.LocalDate;

public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private LocalDate datumNarodenia;
    private Zamestnavatel zamestnavatel; // Previazeme s triedou Zamestnavatel

    // Parametricky konstruktor
    public Zamestnanec(String meno, String priezvisko, LocalDate datumNarodenia, Zamestnavatel zamestnavatel) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.datumNarodenia = datumNarodenia;
        this.zamestnavatel = zamestnavatel;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public LocalDate getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(LocalDate datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    public Zamestnavatel getZamestnavatel() {
        return zamestnavatel;
    }

    public void setZamestnavatel(Zamestnavatel zamestnavatel) {
        this.zamestnavatel = zamestnavatel;
    }

    @Override
    public String toString() {
        return "Zamestnanec{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", datumNarodenia=" + datumNarodenia +
                ", zamestnavatel=" + zamestnavatel +
                '}';
    }
}
