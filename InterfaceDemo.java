interface Animal 
{
  // interface method (does not have a body)
  public void animalSound();
  // interface method (does not have a body)
  public void sleep(); 
}

class Cat implements Animal 
{
  public void animalSound() 
  {
    System.out.println("The Cat says: Meow Meow");
  }
  public void sleep() 
  {
    System.out.println("Zzz");
  }
}

class InterfaceDemo 
{
  public static void main(String[] args) 
  {
    Cat myCat = new Cat();
    myCat.animalSound();
    myCat.sleep();
  }
}
