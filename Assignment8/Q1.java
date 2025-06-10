abstract class Animal {
    abstract void makeSound();

    void breathe() {
        System.out.println("Breathing...");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}
public class Q1{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Demonstrating Dog:");
        dog.breathe();
        dog.makeSound();

        System.out.println("\nDemonstrating Cat:");
        cat.breathe();
        cat.makeSound();
    }
}
