//Single inheritance
// for notes on oopS concept see context of day17.

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
class SingleInheritance
{
  public static void main(String args[])
  {
    //A obj1= new A(); //new keyword creating an object and circular braces calling default constructor
    B obj2 = new B();
    A.methodOne();
    int res2=obj2.methodTwo(3,4);
     //System.out.println(res1);
     System.out.println(res2); 
     //System.out.println(res1 + res2);
  }
}