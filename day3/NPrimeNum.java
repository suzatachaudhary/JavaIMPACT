class NPrimeNum
{
  public int prime(int n)
  {
    for(int i=2;i<=n;i++)
    {
      boolean isprime=true;
      for(int j=2;j<i;j++)
      {
        if(i%j == 0)
        {
          isprime=false;
        }
      }
      if (isprime==false){
        System.out.println(i);
      }
    }
  }
  public static void main(String args[])
  {
    int n=20;
    NPrimeNum obj = new NPrimeNum();
    obj.prime(n);
  }
}