import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = sc.nextInt();
		int rev = 0;
		int sum = 0;
		int temp = 0;
		temp=num;
		while(num>0)
		{
			rev = num%10;
			num = num/10;
			sum = sum+rev*rev*rev;
		}
		if(sum==temp)
		{
			System.out.print("Its a Armstrong Number : "+temp);
		}
		else
		{
			System.out.print("Its a  Not Armstrong Number : "+temp);
		}
	}
}