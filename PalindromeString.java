import java.util.Scanner;
class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String s = sc.next();
        String rev = "";
        char ch = 0;
        for(int i=0;i<=s.length();i++)
        {
            ch = s.charAt(i);
            rev = ch+rev;
        }
		if(rev==s)
		{
        System.out.println("Its a Palindrome String : "+s);
		}
		else
		{
			System.out.println("Its Not Palindrome Number : "+s);
		}
    }
}