package Practice.Casting;

// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass extending Animal
class Dog extends Animal {
    //Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void wagTail() {
        System.out.println("Tail wagging");
    }
}

public class Casting {
    public static void main(String[] args) {
        // Upcasting: Subclass reference to a superclass reference
        Animal animal1 = new Dog(); // Upcasting
        animal1.makeSound(); // Output: Woof
        // animal1.wagTail(); // Error: wagTail() is not accessible through the animal1 reference
        
        // Downcasting: Superclass reference to a subclass reference
        Animal animal2 = new Dog(); // Upcasting
        Dog dog = (Dog) animal2; // Downcasting
        dog.makeSound(); // Output: Woof
        dog.wagTail(); // Output: Tail wagging
    }
}