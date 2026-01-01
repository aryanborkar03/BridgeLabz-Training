package com.inheritance.hierarchical.animalhierarchy;

public class AnimalHierarchy {

    public static void main(String[] args) {

        // Polymorphism: parent reference holding child objects
        Animal animal1 = new Dog("Coco", 3);
        Animal animal2 = new Cat("Meechan", 2);
        Animal animal3 = new Bird("Tweety", 1);

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
