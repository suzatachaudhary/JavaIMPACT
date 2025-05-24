//
class A{
  int method2(int a, int b)
  {
    return a + b;
  }
  int method2(int a, int b, int c)  // same method name in same class with different parameters it is called as method overloading.
  {
    return a+b+c;
  }
}
class B extends A
{
  int method2(int a, int b, int c)  // same method name with same parameters in child class with parent class it is called method overriding.
  {
    return a+b+c;
  }
}