//n=27    1 1 0 1 1  
// i= 1         *     this one (1) we have to make it 0.
class ClearIthBit
{
  public static void main(String args[])
  {
    int n=27;
    int i=1;
    int res = (n & ((1 << i)));     //n & 1's complement of (1<<i)
    System.out.println("Result after clearing ith bit is "+res);
  }
}
n & 0<<i