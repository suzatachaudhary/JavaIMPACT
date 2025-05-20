// finding sum Maximum Sum of a Subarray of Size k
// k will be given and array size will be given.

import java.util.Scanner;
class SlidingWindowApproach{
  public int maxSubArraySum(int arr[], int k) {
     int maxSum=0;
     int windowSum=0;
      if (arr.length < k) 
      {
        return -1; // Edge case: Not enough elements for a valid window
      }


     for(int i=0;i<k;i++)
     {
      windowSum += arr[i];
     }  
     maxSum=windowSum;

     for(int i=k;i<arr.length;i++)
     {
       windowSum += arr[i] - arr[i-k];
       maxSum = Math.max(maxSum, windowSum);
     }
     return maxSum;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int k=in.nextInt();
    int n=in.nextInt();
    int[] arr=new int[n];

    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    SlidingWindowApproach obj=new SlidingWindowApproach();
    System.out.println(obj.maxSubArraySum(arr, k));
  }
}