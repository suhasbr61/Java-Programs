//Wap to find specified element index 
import java.util.Scanner;
class ArraySpecifiedElementsIndex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your size : ");
		// Declartion & Creation
		int[] arr = new int [sc.nextInt()]; 
		// Intialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Element "+(i+1)+" = ");
			arr[i] = sc.nextInt();
		}
		 System.out.println("Enter your index to find : ");
		 int element = sc.nextInt();
		 
		 // Method calling
		int index = findSpecifiedElementsIndex(arr,element);
		if(index<0)
		{
			System.out.println(element+" Not Found ");
		}
		else {
			System.out.println(element+" Found at index "+index);
		}
		sc.close();
	}
	public static int findSpecifiedElementsIndex(int[]arr,int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				return i;
			}
		}
		return -1;
	}
}
