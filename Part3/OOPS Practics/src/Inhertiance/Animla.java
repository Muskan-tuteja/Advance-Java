package Inhertiance;

public class Animla {
    void eat() {
        System.out.println("Eating..");
    }
}

class Dog extends Animla {
    void bark() {
        System.out.println("Barking...");
    }

    public static void main(String[] args) {
        Dog a = new Dog();
        a.eat();
        a.bark();
    }
}