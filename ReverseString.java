import java.util.Scanner;
class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Orginial Name : ");
        String str = sc.next();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println("Your Reversed Name : "+rev);
    }
}