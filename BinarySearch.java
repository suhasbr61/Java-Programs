import java.util.*;
class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Element : "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Your Element to find : ");
		int key = sc.nextInt();
		if(isBinarySearch(arr,key))
		{
			System.out.print("Is found");
		}
		else
		{
			System.out.print("Is Not found");
		}
	}
	public static boolean isBinarySearch(int[] arr,int key)
	{
		
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		while(start<=end)
		{
			mid = (start+end)/2;
			if(arr[mid]==key)
			{
				 return true;
			}
			else if(arr[mid]<key)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		return false;
	}
	
}