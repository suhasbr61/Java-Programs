class MethodOverloading
{
    public int multiply(int x,int y)
    {
        return(x*y);
    }
    public int multiply(int x,int y,int z)
    {
        return(x*y*z);
    }
    public double multiply(double x,double y)
    {
        return(x*y);
    }
    public double multiply(double x,double y,double z)
    {
        return(x*y*z);
    }
    public static void main(String[] args) {
        {
            MethodOverloading m1 = new MethodOverloading();
            System.out.println(m1.multiply(5, 6)); 
            System.out.println(m1.multiply(5, 6, 7));
            System.out.println(m1.multiply(5.5, 6.6)); 
            System.out.println(m1.multiply(5.5, 6.6,7.7)); 
        }
    }
}