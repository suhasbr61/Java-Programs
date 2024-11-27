import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        Set<Integer> numbers = new TreeSet<>();
        
        // Adding elements
        numbers.add(42);
        numbers.add(25);
        numbers.add(60);
        numbers.add(10);
        numbers.add(42); // Duplicate element, will not be added
        
        // Accessing elements
        System.out.println("Numbers Set (Sorted): " + numbers);
        
        // Checking if a specific element is present
        if (numbers.contains(25)) {
            System.out.println("25 is in the set.");
        }
        
        // Removing an element
        numbers.remove(60);
        System.out.println("After removing 60: " + numbers);
    }
}
