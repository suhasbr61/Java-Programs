import java.util.*;
class FactorialUsingRecursion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int  fact = getFacrecurrsion(num);
		System.out.print(" Factorial number using Recursion " + num + " = " +fact );
	}
	
	public static int getFacrecurrsion(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return num * getFacrecurrsion(num - 1);
		}
		// System.out.print(" Factorial number using Recursion " + num * getFacrecurrsion(num - 1) );
	}
}
