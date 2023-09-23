package oop.prepojenie2tabuliek.priklad1;

public class Zamestnavatel {
    private String nazov;
    private String adresa;
    private String obec;
    private String psc;

    // Parametricky konstruktor
    public Zamestnavatel(String nazov, String adresa, String obec, String psc) {
        this.nazov = nazov;
        this.adresa = adresa;
        this.obec = obec;
        this.psc = psc;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    @Override
    public String toString() {
        return "Zamestnavatel{" +
                "nazov='" + nazov + '\'' +
                ", adresa='" + adresa + '\'' +
                ", obec='" + obec + '\'' +
                ", psc='" + psc + '\'' +
                '}';
    }
}
