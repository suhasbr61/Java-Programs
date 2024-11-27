class Recursion 
{
    public static void main(String[] args) 
	{
        System.out.println("Main Starts.....");
        recursion(0); 
        System.out.println("Main Ends......."); 
    }

    public static void recursion(int count) 
	{
        if (count < 5) 
		{ 
            System.out.println("Hi");
            recursion(count + 1); 
        }
    }
}
