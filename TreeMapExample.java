import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<String, Integer> scores = new TreeMap<>();
        
        // Adding key-value pairs
        scores.put("Afreed", 95);
        scores.put("Vazid", 85);
        scores.put("Virat", 90);
        scores.put("ABD Velliers", 95);
        System.out.println("All Elements :"+scores);
		
        // Accessing elements by key
        System.out.println("Score of Afreed: " + scores.get("Afreed"));
        
        // Iterating over the TreeMap
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
        
        // Removing an entry
        scores.remove("ABD Velliers");
        System.out.println("After removing ABD Velliers: " + scores);
    }
}
