import java.util.Vector;
import java.util.List;

class VectorExample 
{
    public static void main(String[] args) 
	{
        // Create a Vector
        List<String> colors = new Vector<>();
        
        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
		colors.add("White");
        
        // Accessing elements
        System.out.println("Colors List: " + colors);
        
        // Inserting an element
        colors.add(1, "Yellow"); // Insert Yellow at index 1
        System.out.println("After Inserting Yellow: " + colors);
        
        // Removing an element
        colors.remove("Green");
        System.out.println("After removing Green: " + colors);
        
        // Size of the Vector
        System.out.println("Size of Vector: " + colors.size());
		 // Iterating through the LinkedList
        System.out.println("Iterating through the Vector:");
		for (String color :colors) 
		{
            System.out.println(color);
		}
    }
}
