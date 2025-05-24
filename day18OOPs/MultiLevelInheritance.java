//Single inheritance
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
class C extends B
{
    int methodFour(int a)
    {
      return a;
    }
}
class MultiLevelInheritance
{
  public static void main(String args[])
  {
    //A obj1= new A(); //new keyword creating an object and circular braces calling default constructor
    C obj2 = new C();
    A.methodOne();
    
     //System.out.println(res1);
     System.out.println(obj2.methodTwo(3,4));
     System.out.println(obj2.methodThree(3,4,5));
     System.out.println(obj2.methodFour(3));
     //System.out.println(res1 + res2);
  }
}