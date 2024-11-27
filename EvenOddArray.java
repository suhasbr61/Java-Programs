import java.util.Scanner;
class EvenOddArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int arr[] = new int[sc.nextInt()];
       for(int i=0;i<arr.length;i++)
       {
         System.out.println("Enter the  element at index "+i+" : ");
         arr[i] = sc.nextInt();
       }
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]%2==0)
        {
            System.out.print("Even Number  : "+arr[i]+" ");
        }
        else
        {
            System.out.print("Odd Number  : "+arr[i]+" ");
        }
       }
    }
}