// Given an integer array nums, return the most frequent even element.

// If there is a tie, return the smallest one. If there is no such element, return -1.

 

// Example 1:

// Input: nums = [0,1,2,2,4,4,1]
// Output: 2
// Explanation:
// The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
// We return the smallest one, which is 2.

import java.util.Map;
import java.util.HashMap;

class LeetCode2404
{ 
  public static void main(String args[])
  {
    int[] nums={9,3,7,5,3,1,1};
    System.out.println(LeetCode2404.mostFrequentEven(nums));
  }
  public static int mostFrequentEven(int[] nums)
  {
    Map<Integer,Integer> MapCount = new HashMap<>();

    for(int num: nums)
    {
      if(num%2==0)
      {
        MapCount.put(num, MapCount.getOrDefault(num,0)+1);
      }
    }
    int mostFrequentNum=-1;
    int Maxcount=0;

    for(Map.Entry<Integer,Integer> result: MapCount.entrySet())
    {
      int num=result.getKey();
      int count=result.getValue();

      if(count>Maxcount || (count==Maxcount && num<mostFrequentNum))
      {
        mostFrequentNum=num;
        Maxcount=count;
      }
    }
    return mostFrequentNum;

  }
}