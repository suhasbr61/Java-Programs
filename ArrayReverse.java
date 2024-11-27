import java.util.Scanner;
class ArrayReverse
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
         System.out.println("Original Array Element : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
		System.out.println("");
        System.out.println("Reverse Array Element : ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}