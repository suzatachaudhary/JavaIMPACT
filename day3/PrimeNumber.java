class PrimeNumber{
  boolean prime(int n)
  {
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String args[])
  {
    int n=15;
    PrimeNumber obj=new PrimeNumber();  //object creation for Main class using constructor
    System.out.println(obj.prime(n));

  }
}