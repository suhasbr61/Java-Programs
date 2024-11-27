// Interface 1
interface Animal 
{
    void eat();
}

// Interface 2
interface Pet 
{
    void play();
}

// Class implementing both interfaces
class Dog implements Animal, Pet 
{
    public void eat() 
	{
        System.out.println("The dog eats.");
    }

    public void play() 
	{
        System.out.println("The dog plays.");
    }
}

public class MultipleInheritanceDemo 
{
    public static void main(String[] args) 
	{
        Dog dog = new Dog();
        dog.eat();  // Method from Animal interface
        dog.play(); // Method from Pet interface
    }
}
