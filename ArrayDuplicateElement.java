import java.util.Scanner;
class ArrayDuplicateElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int arr[] = new int[sc.nextInt()];
		for(int i =0;i<arr.length;i++)
		{
			System.out.print("Enter Element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}