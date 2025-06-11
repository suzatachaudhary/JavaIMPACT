class SetBit
{
  public static void main(String args[])
  {
    int n=25;
    int i=2;

    if((n & (1<<i)) != 0)
    {
      System.out.println("Set bit");
    }
    else{
      System.out.println("Not set bit");
    }
  }
}