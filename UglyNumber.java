import java.util.*;
class UglyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		
		if (getUlgyNumberis(num))
		{
			System.out.print("This is a UglyNumber ");
		}
		else
		{
			System.out.print("This is not a UglyNumber ");
		}
	}
	public static boolean getUlgyNumberis(int num)
	{
		if(num > 0)
		{
			while(num != 1)
			{
					if(num %2 == 0)
					{
						num = num/2;
					}
					else if(num % 3 ==0)
					{
						num = num/3;
					}
					else if(num % 5 ==0)
					{
						num = num/5;
					}
					else
					{
						return false;
					}
				
			}
		}
		return true;
	}
}
