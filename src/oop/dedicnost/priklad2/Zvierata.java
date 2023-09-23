package oop.dedicnost.priklad2;

// Nadtřída (rodičovská třída)
class Zvire {
    String jmeno;

    public Zvire(String jmeno) {
        this.jmeno = jmeno;
    }

    public void zvuk() {
        System.out.println("Zvíře vydává zvuk");
    }
}

// Podtřída (dědící třída)
class Pes extends Zvire {
    public Pes(String jmeno) {
        super(jmeno); // Volá konstruktor nadřazené třídy
    }

    // Přepisuje (override) metodu z nadřazené třídy
    @Override
    public void zvuk() {
        System.out.println(jmeno + " štěká: Haf! Haf!");
    }
}

public class Zvierata {
    public static void main(String[] args) {
        Zvire zvire = new Zvire("Nějaké zvíře");
        Pes pes = new Pes("Buddy");

        zvire.zvuk(); // Vypíše: Zvíře vydává zvuk
        pes.zvuk();   // Vypíše: Buddy štěká: Haf! Haf!
    }
}
