class Animal{
  void eat()
  {
    System.out.println("Animal is Eating...");
  }
}
class Dog extends Animal
{
  @override
  void eat()
  {
    System.out.println("Dog is eating");
  }
}
public class OverrideMethod{
  public static void main(String[] args) {
    Animal animal=new Dog();
    animal.eat();
}
}