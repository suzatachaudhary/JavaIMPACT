// Problem Statement:

// You are given an array prices where prices[i] is the price of a given stock on the i th day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Input Format:Input Format:

// Input Explanation:

// The first line contains an integer n, representing the number of days. The second line contains n space-separated integers, where the i th integer represents the price of the stock on day i.

// Output Format:Output Format:

// Output Explanation:

// A single integer representing the maximum profit achievable. If no profit.A single integer representing the maximum profit achievable. If no profit is possible, output 0.

// Constraints:

// 1<= n <= 10^5

// 0 <= prices[i] <= 10^4

// Sample Input 1:

// 5

// 176431

// Sample Output 1:

// 0

import java.util.Scanner;
class CapgeminiMockTest{
  public static int maxProfit(int[] prices)
  {
   int minPrice=Integer.MAX_VALUE;
   int maxProfit=0;

   for(int price:prices)
   {
    if(price<minPrice)
    {
      minPrice=price;
    }
    else
    {
      int profit=price-minPrice;
      maxProfit=Math.max(maxProfit,profit);
    }
   }
   return maxProfit;
  }

  public static void main(String[] args)
  { Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] price=new int[n];

    for(int i=0;i<n;i++)
    {
      price[i]=sc.nextInt();
    }
    System.out.println(maxProfit(price));
  }
}