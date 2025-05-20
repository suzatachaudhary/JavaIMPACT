//Sliding window for prefix suffix and mix sum.
// k=3
// input:[1,2,3,4,5,6,1]

//  4 case:
//  --3 from left only
//  --2 from left 1from right
//  --1 from left 2 from right
//  --3 from right only.
// here we have two things 
// 1.left sum
// 2.right sum
import java.util.Scanner;
class Leetcode1423
{
  public int maxScore(int[] cardPoints, int k) 
  {
    int n=cardPoints.length;
    int leftSum=0;
    int rightSum=0;
    int maxSum=0;
    

    for(int i=0;i<k;i++)
    {
      leftSum=leftSum+cardPoints[i];
    }
    maxSum=leftSum;

    for(int i=n-k;i<n;i++)
    {
      rightSum=rightSum+cardPoints[i];
    }
    maxSum=Math.max(maxSum,rightSum);

    int leftpartial=0;
    int rightpartial=rightSum;
    for(int i=0;i<k;i++)
   {
    leftpartial += leftpartial+cardPoints[i];
    rightpartial -= rightpartial-cardPoints[n-k+i];
    maxSum=Math.max(maxSum,leftpartial+rightpartial);
   }
   return maxSum;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int k=in.nextInt();
    int n=in.nextInt();
    int[] cardPoints=new int[n];

    for(int i=0; i<n;i++)
    {
      cardPoints[i]=in.nextInt();
    }
    Leetcode1423 obj=new Leetcode1423();
    System.out.println(obj.maxScore(cardPoints,k));
  }
}