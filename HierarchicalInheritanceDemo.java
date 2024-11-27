// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

// Child Class 1
class Dog extends Animal 
{
    void bark() 
	{
        System.out.println("The dog barks.");
    }
}

// Child Class 2
class Cat extends Animal 
{
    void meow() 
	{
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceDemo 
{
    public static void main(String[] args) 
	{
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Method in Dog class

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Method in Cat class
    }
}
