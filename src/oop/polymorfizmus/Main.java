package oop.polymorfizmus;

import java.util.ArrayList;

abstract class Animal {
    public abstract void animalSound();
    public void run() {
        System.out.println("Animal runs");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Kvik kvik");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Bark bark");
    }

    @Override
    public void animalSound() {
        System.out.println("Hav hav");
    }
}

class LittleDog extends Dog {
    @Override
    public void animalSound() {
        System.out.println("The litle dog says: hav hav");
    }
}

class Main {
    public static void main(String[] args) {
        //Animal myAnimal = new Animal();  // Create a Animal object
        Pig myPig = new Pig();  // Create a Pig object
        Dog myDog = new Dog();  // Create a Dog object
        LittleDog myLittleDog = new LittleDog();
        Animal myBigDog = (Dog) myLittleDog;
        // Dog myDog2 = (Dog) myDog;

        //myAnimal.animalSound();
        myPig.animalSound();
        myPig.run();
        myDog.animalSound();
        myDog.run();
        // myDog.bark(); // Toto nemozeme zavolat v ramci pouzitia polymorfizmu

        // Vytvorme farmu zvierat, v ktorej budu zaregistrovane jednotlive zvierata
        //ArrayList<Animal> farm1 = new ArrayList<>();
        var farm = new ArrayList<Animal>();
        farm.add(myPig);
        farm.add(myDog);
        farm.add(myLittleDog);

        for (Animal concreteAnimal : farm) {
            concreteAnimal.animalSound();
            concreteAnimal.run();
        }

    }
}