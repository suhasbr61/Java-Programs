import java.util.Scanner;
class ArrayFindSumOfElements
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int arr[] =new int[sc.nextInt()];
		int sum = 0;
		for(int i =0;i<arr.length;i++)
		{
			System.out.print("Enter the element " + (i+1)+ " = ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements is : "+sum);
	}
}
