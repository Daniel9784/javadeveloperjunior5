package oop.rozhranie;

// Pig "implements" the Animal interface
class Pig implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
    }

    public void run() {

    }

}
