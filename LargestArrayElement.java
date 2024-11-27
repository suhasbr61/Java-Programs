import java.util.Scanner;
class LargestArrayElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int arr[] = new int[sc.nextInt()];
		int largest = 0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter Element "+(i+1)+" Value : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		System.out.println("Largest Element : "+largest);
	}
}