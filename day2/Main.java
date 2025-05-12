/* using static keyword static block will be created and it is a singleton block

#Static Method- For static method we don't need to create a object . static will act as instance or object.and using class name you can call static method.
example below*/
Class Animal{
  static void eat(){
    System.out.println("Animal is eating");
  }
}
class Dog extends Animal{
  static void eat(){
    System.out.println("Dog is eating");
  }
}
public class Main{
  public static void main(String[] args){
    Animal.eat();
    Dog.eat();
  }
}