import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class ArrayListDemo
{
	public static void main(String[] args)
	{
	    ArrayList<Integer> a1 = new ArrayList<>(); 
		a1.add(0);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("Print All Element : "+a1);
		// a1.size();
		System.out.println("Number of Element : "+a1.size());
		//remove();
		System.out.println("Remove of Element : "+a1.remove(1));
		// After remove 
		System.out.println("Print All Element : "+a1);
		// Adding Duplicate Element 
		a1.add(0);
		System.out.println("Duplicate Element : "+a1);
		//Adding Insert new Value
		a1.add(1,1);
		a1.add(6,6);
		System.out.println("Adding Element : "+a1);
		// Retrive specific element 
		System.out.println("After retrive : "+(a1.get(2)));
		// Change the Value or Replace Value 
		a1.set(7,7);
		System.out.println("After Replace : "+(a1));
     	// Element contains or not - true || false 
		System.out.println(a1.contains(7));
		System.out.println(a1.contains(8));
		//By Loop
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i)+" ");
		}
        // Adding New Elements
		a1.add(2);
		a1.add(1);
		System.out.println("After Adding Element : "+a1);
		// Ascending Order by collection sort
		Collections.sort(a1);
		System.out.println("Element after Sorting : "+a1);
	}
}