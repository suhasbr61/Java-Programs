import java.util.Scanner;
class FibonacciSeries 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        for(int i=2;i<=n;i++)
        {
             sum = n1+n2;
            System.out.println(" "+sum);
            n1 = n2;
            n2 = sum;
        }
    }
}