import java.util.Scanner;
class ArrayAverageElements
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int arr[] = new int[sc.nextInt()];
		int sum = 0;
		int avg = 0;
		for(int i =0;i<arr.length;i++)
		{
			System.out.print("Element of "+(i+1)+" = ");
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		    avg = sum/arr.length;
		}
		System.out.print("Avg of elements : "+avg);
	}
}