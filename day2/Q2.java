class Demo{
  static{
    System.out.println("Static block");
  }
  Demo(){
    System.out.println("Parameterized constructor");
  }
}

public class Q2{
  public static void main(String[] args) 
  {
    Demo d1 = new Demo();
    Demo d2 = new Demo();
  }
}
