package oop.abstrakt;

// Pig "implements" the Animal interface
class Pig extends Animal {

    @Override
    void animalSound() {
        System.out.println("Prasa kvíka");
    }

    @Override
    void run() {
        System.out.println("Prasa beží");
    }
}
