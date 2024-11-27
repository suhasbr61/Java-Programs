import java.util.Scanner;
class ArrayInsertElement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be inserted : ");
        int insert = sc.nextInt();
        System.out.print("Enter the new Element : ");
        int newElement = sc.nextInt();
        for(int i=size;i>insert;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[insert] = newElement;
        size++;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}