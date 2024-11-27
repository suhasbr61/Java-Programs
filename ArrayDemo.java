import java.util.Scanner;
class ArrayDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the Element at Index "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
}