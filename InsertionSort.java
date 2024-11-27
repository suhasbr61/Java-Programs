import java.util.Scanner;
class InsertionSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int arr[] = new int[sc.nextInt()];
		int current =0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" element : ");
			arr[i] = sc.nextInt(); 
		}
		for(int i =0;i<arr.length-1;i++)
		{
			current = arr[i];
			int j = i-1;
			while(j>=0 && current<arr[j])
			{
				arr[j+1]=arr[j];
			    j--;
			}
			arr[j+1]=current;
		}
		printArray(arr);
	}
	public static void printArray(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}