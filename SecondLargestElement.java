import java.util.Scanner;
class SecondLargestElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int largest = 0;
		int secondlargest = 0;
		System.out.print("Enter the Array Size : ");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		System.out.println("Largest Element is : "+largest);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>secondlargest && arr[i]<largest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println("Second Largest Element is : "+secondlargest);
	}
}