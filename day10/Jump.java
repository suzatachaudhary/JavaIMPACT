class Jump
{
  public static void main(String args[])
  {
    int[] arr={2,3,1,1,4}
    int start=0;
    int end=0;
    int jump=0;
    int maxReach=0;

    while( i<arr.length-1 && maxReach>=i)
    {
       maxReach=Math.max(maxReach,arr[i]+1)
    }
  }
}