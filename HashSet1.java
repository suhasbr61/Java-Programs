import java.util.HashSet;
import java.util.Set;
public class HashSet1
{
	public static void main(String[] args)
	{
		Set<String> hashset = new HashSet<>();
		hashset.add("Apple");
		hashset.add("Banana");
		hashset.add("Jerry");
		hashset.add("Monago");
		System.out.println("HashSet :"+hashset);
		hashset.add("Apple"); // Duplicates are not allowed
		System.out.println("Hashset :"+hashset);
	}
}