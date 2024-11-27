import java.util.ArrayList;
import java.util.Collections;
class ReverseArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		System.out.println("Array List : "+arraylist);
		Collections.reverse(arraylist);
		System.out.println("Reverse Array List : "+arraylist);
	}
}