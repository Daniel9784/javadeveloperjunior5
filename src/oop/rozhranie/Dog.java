package oop.rozhranie;

public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: hav hav");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzz");
    }

    public void bark() {
        System.out.println("Vrrrrr");
    }
}
