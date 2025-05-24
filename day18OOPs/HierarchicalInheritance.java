//Hierarchical inheritance
class A
{
    static void methodOne()
    {
        System.out.println("Hello i am suzyy");
    }
    int methodTwo(int a, int b)
    {
      return a+b;
    }
}
class B extends A
{
   int methodThree(int a, int b, int c)
   {
     return a+b+c;
   }
}
class C extends A
{
    int methodFour(int a)
    {
      return a;
    }
}
class HierarchicalInheritance
{
  public static void main(String args[])
  {
    //A obj1= new A(); //new keyword creating an object and circular braces calling default constructor
    B obj1= new B();
    C obj2 = new C();
    A.methodOne();
    
     //System.out.println(res1);
     System.out.println(obj1.methodTwo(10, 20));
     System.out.println(obj2.methodFour(3));
     //System.out.println(res1 + res2);
  }
}