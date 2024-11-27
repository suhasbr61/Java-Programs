import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int rev = 0;
		int temp = 0;
		temp = num;
		while(num>0)
		{
			rev = num%10;
			sum = sum*10+rev;
			num = num/10;
		}
		System.out.println("ReverseNumber : "+sum);
	}
}