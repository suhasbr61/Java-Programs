import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverseUsingCollections {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Adding elements
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        
        System.out.println("Original LinkedList: " + linkedList);
        
        // Using Collections.reverse() to reverse the list
        Collections.reverse(linkedList);
        
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
