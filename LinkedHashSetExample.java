import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample 
{
    public static void main(String[] args) 
	{
        // Create a LinkedHashSet
        Set<String> animals = new LinkedHashSet<>();
        
        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Cat"); // Duplicate element, will not be added
        
        // Accessing elements
        System.out.println("Animals Set: " + animals);
        
        // Iterating over the set
        System.out.println("Iterating through LinkedHashSet:");
        for (String animal : animals) 
		{
            System.out.println(animal);
        }
        
        // Removing an element
        animals.remove("Dog");
        System.out.println("After removing Dog: " + animals);
    }
}
