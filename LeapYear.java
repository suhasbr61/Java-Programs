import java.util.Scanner;
class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        if(year%400==0)
        {
            if(year%100==0)
            {
                System.out.println("Its a Leap Year : "+year);
            }
            else 
            {
                System.out.println("Its a Not Year : "+year);
            }
        }
        else
        {
            if(year%4==0)
            {
                System.out.println("Its a Leap Year : "+year);
            }
            else 
            {
                System.out.println("Its  a Not Year : "+year);

            }
        }
    }
}