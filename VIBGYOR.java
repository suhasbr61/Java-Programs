import java.util.Scanner;
class VIBGYOR
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Rainbow num : ");
		int a  = sc.nextInt();
		switch(a)
		{
			case 1:
					System.out.println("Its a Violet Colour");
					break;
			case 2 :
					System.out.println("Its a Indigo Colour");
					break;
			case 3 :
					System.out.println("Its a Blue Colour");
					break;
			case 4 :
			
					System.out.println("Its a Green Colour");
					break;
			case 5:
					System.out.println("Its a Yellow Colour");
					break;
			case 6:
					System.out.println("Its a Organe Colour");
					break;
			case 7:
					System.out.println("Its a Red Colour");
					break;  
			default:
					System.out.println("Enter Valid Option..");
		}
	}
}