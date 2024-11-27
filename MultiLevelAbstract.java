abstract class A
{
    abstract public void run();
    abstract public void walk();
}
abstract class B extends A 
{
    public void run()
    {
        System.out.println("Run on the road");
    }
}
class C extends B
{
    public void walk()
    {
        System.out.println("walk on the road");
    }
}
class MultiLevelAbstract
{
    public static void main(String[] args) {
        C c = new C();
        c.run();
        c.walk();
    }
}