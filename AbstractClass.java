// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Non-abstract method
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Object of the Dog class
        myDog.sound();          // Calls the abstract method's implementation
        myDog.sleep();          // Calls the non-abstract method
    }
}
