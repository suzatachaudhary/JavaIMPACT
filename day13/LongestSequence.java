//[1,2,101,3,102,4,103]--> output[4(1,2,3,4)] and[3(101,102,103)]
//Longest consecutive element.
//approach:
// 1.push the array elements into the set.as set won't contain index value use for each loop
// 2.iterate starting to end. after iterarting find the starting point
//     for(0--->n-1)
//     {
//     set.add(arr[i])
//     }
//     for(int i:set)
//     {
//       if(!set.contains(i-1))
//       {
//       start=i;
//       count = 1;
//       while(set.contains(start+1))
//       {
//       count++;
//       }
//       Max=max(max,count);
//       }
//     }

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
class LongestSequence
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     int max=0;

    Set<Integer> set=new HashSet<>();

     for(int i=0;i<n;i++)
     {
      arr[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {
      set.add(arr[i]);
     }
     int count=0;
     for(int i: set)
     {
      if(!set.contains(i-1))
      {
        int start=i;
        count=1;
        while(set.contains(start+1))
        { 
          start++;
          count++;
        }
      }
      max=Math.max(max,count);
     }
     System.out.println(max);

  }
}

     
