import java.util.*;
class StrontioNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the four digits Number =  " );
        int num = sc.nextInt();
        int strotio = 0;
        strotio=num;
        num =(num*2%1000)/10;
        
        if(num%10 == num/10)
        {
             System.out.print(strotio  + 	"" + " This is StrontioNumber ");
        }
        else
        {
             System.out.print(strotio + "" + " This is not a StrontioNumber");
        }
        
    }
}

