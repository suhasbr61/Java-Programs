import java.util.Scanner;
class SelectionSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int arr[] = new int[sc.nextInt()];
		int temp =0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" element : ");
			arr[i] = sc.nextInt(); 
		}
		for(int i =0;i<arr.length-1;i++)
		{
			int smallest = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
				    smallest = j;
				}
			}
			temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
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