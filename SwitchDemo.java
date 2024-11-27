import java.util.Scanner;
class SwitchDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Num : ");
		int num = sc.nextInt();
		switch(num) {
			case 1 : System.out.println("Its a Sunday");
			break;
			case 2 : System.out.println("Its a Monday");
			break;
			case 3 : System.out.println("Its a Tuesday");
			break;
			case 4 : System.out.println("Its a Wednesday");
			break;
			case 5 : System.out.println("Its a Thursday");
			break;
			case 6 : System.out.println("Its a Friday");
			break;
			case 7 : System.out.println("Its a Saturaday");
			break;
			default : System.out.println("Its a Invalid Option..");
		}
	}
}