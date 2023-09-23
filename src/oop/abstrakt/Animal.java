package oop.abstrakt;

public abstract class Animal {
    void animalSound() {
        System.out.println("Zviera sa prejavuje nejakým zvukom");
    };
    void sleep() {
        System.out.println("Zviera spí");
    }
    abstract void run(); // Metoda oznacena abstract je nanutena pri implementacii. Zaroven musi byt aj v triede vlozene slovo abstract
}
