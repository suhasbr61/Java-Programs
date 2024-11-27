import java.util.TreeSet;
import java.util.Set;
class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("B");
		treeSet.add("A"); // Naturally Ordered for Sequence 
		treeSet.add("C");
		treeSet.add("C"); // Duplicate Not Allowed
		treeSet.add("D");
		System.out.println("TreeSet Values : "+treeSet);
		treeSet.remove("A");
		System.out.println("After Removing : "+treeSet);
		treeSet.add("A");
		System.out.println("After Adding : "+treeSet);
		System.out.println(size(treeSet));
	}
}