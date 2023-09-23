package oop.abstrakt;


class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.run();

        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
        myDog.run();
        // Animal myAnimal = new Animal(); //Vytvorenie objektu z abstraktnej triedy nie je mozne
    }
}
