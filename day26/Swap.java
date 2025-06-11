class Swap
{
  public static void main(String args[])
  {
    int a = 21;
    int b = 23;
     a = a^b;
     b = a^b;
     a = a^b;

    System.out.println("a="+a+",b="+b);
  }
}