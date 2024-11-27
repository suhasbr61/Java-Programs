import java.util.Scanner;
class MultiDemesionalDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array1 Size : ");
        int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Array1 Element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Array2 Size : ");
        int brr[] = new int[sc.nextInt()];
		for(int i=0;i<brr.length;i++)
		{
			System.out.print("Enter the Array2 Element : "+(i+1)+" : ");
			brr[i] = sc.nextInt();
		}
		System.out.print("Enter the Array3 Size : ");
        int crr[] = new int[sc.nextInt()];
		for(int i=0;i<crr.length;i++)
		{
			System.out.print("Enter the Array3 Element : "+(i+1)+" : ");
			crr[i] = sc.nextInt();
		}
		System.out.print("Enter the Array4 Size : ");
        int drr[] = new int[sc.nextInt()];
		for(int i=0;i<drr.length;i++)
		{
			System.out.print("Enter the Array4 Element : "+(i+1)+" : ");
			drr[i] = sc.nextInt();
		}
		int[] err = new int[arr.length + brr.length+crr.length+drr.length];
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				crr[j] = arr[j];
			}
			for(int k=arr.length;k<crr.length;k++)
			{
				crr[k] = brr[k-arr.length];
			}
			System.out.print(" "+crr[i]);
		}
	}
