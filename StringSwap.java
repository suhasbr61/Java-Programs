class StringSwap
{
    public static void main(String[] args)
    {
        String str1 ="Afreed";
        String str2 = "Shaik";
        System.out.println("Before swapping");
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("After swapping");
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
    }
}