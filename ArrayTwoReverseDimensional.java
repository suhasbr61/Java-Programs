import java.util.Scanner;
class ArrayTwoReverseDimensional
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array1 Size : ");
        int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Array1 Element : "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Array2 Size : ");
        int brr[] = new int[sc.nextInt()];
		for(int i=0;i<brr.length;i++)
		{
			System.out.print("Enter the Array2 Element : "+(i+1)+" : ");
			brr[i] = sc.nextInt();
		}
		
		int[] crr = new int[arr.length + brr.length];
			for(int i=0;i<arr.length;i++)
			{
				crr[i] = arr[i];
			}
			for(int i=0;i<brr.length;i++)
			{
				crr[arr.length + i] = brr[arr.length -1-i];
			}
			for(int i=0;i<crr.length;i++)
			{
				System.out.print(" "+crr[i]);
			}
		 
	}
}