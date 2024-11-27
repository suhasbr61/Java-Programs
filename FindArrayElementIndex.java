import java.util.Scanner;
class FindArrayElementIndex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
    
            System.out.print("Enter the  Element to be searched : ");
            int s = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(s==arr[i])
            {
                System.out.println("Element Found at Index : "+i);
            }
        }
    }
}