import java.util.Scanner;
class SpecificArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the Element index of "+i+" : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.println("Index "+i+" Element : "+arr[i]);
        }
    }
}