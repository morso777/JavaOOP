package Polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound(); // prints "The animal makes a sound."
        animal2.makeSound(); // prints "The dog barks."
        animal3.makeSound(); // prints "The cat meows."
    }
}
