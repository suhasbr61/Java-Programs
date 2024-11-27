import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> countries = new HashSet<>();
        
        // Adding elements
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("India"); // Duplicate element, will not be added
        
        // Accessing elements
        System.out.println("Countries Set: " + countries);
        
        // Checking if a specific element is present
        if (countries.contains("USA")) 
		{
            System.out.println("USA is in the set.");
        }
        
        // Removing an element
        countries.remove("Germany");
        System.out.println("After removing Germany: " + countries);
		// Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
		for (String country :countries) 
		{
            System.out.println(country);
		}
    }
}
