package oop.prepojenie2tabuliek.priklad3;

public class Kniha {
    private String nazov;
    private int rokVydania;
    private Autor autor;

    // Konstruktor, ktory je BEZ parametrov
    public Kniha() {
    }

    // Konstruktor, ktory je parametricky
    public Kniha(String nazov, int rokVydania, Autor autor) {
        this.nazov = nazov;
        this.rokVydania = rokVydania;
        this.autor = autor;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "nazov='" + nazov + '\'' +
                ", rokVydania=" + rokVydania +
                ", autor=" + autor +
                '}';
    }
}
