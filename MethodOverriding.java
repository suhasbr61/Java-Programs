// Superclass
class Animal
{
    // Method to be overridden
    public void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Cat extends Animal 
{
    // Overriding the sound method in Cat class
    @Override
    public void sound() 
    {
        System.out.println("Cat meows");
    }
}
class Dog extends Animal 
{
    public void sound() 
    {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        // Create an Animal object
        Animal myAnimal = new Animal();
        myAnimal.sound();

        // Create a Cat object
        Cat myCat = new Cat();
        myCat.sound(); 
     
        // Create a Dog object
        Dog myDog = new Dog();
        myDog.sound();
    }
}
