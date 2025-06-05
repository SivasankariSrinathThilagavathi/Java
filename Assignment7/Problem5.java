class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow says: Moo!");
    }
}
public class Assignment5 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.makeSound(); 
        a = new Cat();
        a.makeSound();
        a = new Cow();
        a.makeSound();
    }
}
