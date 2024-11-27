import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your num : ");
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
		if(temp==sum)
		{
			System.out.println("Its a Armstrong Number : "+temp);
		}
		else
		{
			System.out.println("Its Not Armstrong Number : "+temp);
		}
	}
}