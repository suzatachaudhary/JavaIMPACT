//maximum consecutive ones.
class MaximumConsecutive{
  public static void main(String[] args)
  {
    int[] arr={1,0,1,0,1,1,0,1,1,1};
    /* int temp=0;
    for(int i=0;i<arr.length-1;i++) //this will also work but last index is not getting compared so ...

    {
      if(arr[i]==arr[i+1])
      {
        temp=temp+1;
      }
    }
    System.out.println(temp);
    */
   int max=0;
   int count=0;
   for(int i=0;i<arr.length;i++)
   {
    if(arr[i]==1)
    {
      count++;
    }
    else{
      count=0;
    }
    max=Math.max(count,max);
    /*
    int max(int count, int max)
    {if(count>max)
    {
      return count;
    }
    else
    {
    return max;
    }
    }
    */
      }
   System.out.println(max);
  }
}