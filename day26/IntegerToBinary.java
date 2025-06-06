//integer to binary
//java is 32 bit compiler
//so 31st bit is used for sign bit hence 011111111111111111111 as 0 31st represent sign 2^31-1 is largest value which can be stored.
class BitManipulation
{
  public static void main(String args[])
  {
    int n=25;
    int reversed=0;
    int place=1;

    while(n > 0)
    {
      int rem=n%2;
      reversed = reversed+rem*place;
      place=place*10;
      n /= 2;
    }
    System.out.println("Reversed Number is: "+reversed);
  }
}

