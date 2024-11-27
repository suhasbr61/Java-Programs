class Bike
{
    public void start()
    {
        System.out.println("Bike is starting");
    }
}
class KTM extends Bike
{
    public void drive()
    {
        System.out.println("KTM is driving");
    }
}
class SingleInheritance 
{
    public static void main(String[] args)
    {
        Bike b1 = new Bike();
        b1.start();
		KTM k1 = new KTM();
        k1.drive();
    }
}