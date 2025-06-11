//n>>i and & 1.
class SetBitUsingRightShift
{
  public static void main(String args[])
  {
    int n=7;
    int i=2;

    if((1 & (n>>i)) == 1)
    {
      System.out.println("Set bit");
    }
    else{
      System.out.println("Not set bit");
    }
  }
}
