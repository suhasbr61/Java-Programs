import java.util.*;
class SpyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int sum =0;
		int product = 1;
		int rem = 0;
		int temp = 0;
		temp = num ;
		
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			product = product * rem ;
			num = num/10;
			
		}
		if (product == sum)
		{
			System.out.print("This is a spy number");
		}
		else
		{
			System.out.print("This is not a spy number");
		}
	}
}