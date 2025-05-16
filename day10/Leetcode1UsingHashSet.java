import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class Leetcode1UsingHashSet
{
  public static void main(String args[])
  { 
    int[] arr={2, 7, 11 , 15};
    int target=9;
    Set<Integer> set=new HashSet<>();
    boolean found=false;
    
    for(int i=0; i<arr.length;i++)
    {
      set.add(arr[i]);
      int rem=target-arr[i];
      if(set.contains(rem))
      { 
        found=true;
        System.out.println(Arrays.toString(new int[]{rem,arr[i]}));
      }

    }
    if( !found)
    {
      System.out.println(Arrays.toString(new int[]{}));
    }
    
  }
}