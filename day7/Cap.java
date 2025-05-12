import java.util.Scanner;
class Cap{
  public static int maxProfit(int[] prices)
  {
   int minPrice=Integer.MAX_VALUE;
   int maxProfit=0;

   for(int i=0;i<prices.length;i++)
   {
    if(prices[i]<minPrice)
    {
      minPrice=prices[i];
    }
   }
   for(int i=0;i<prices.length;i++)
   {
    int profit=prices[i]-minPrice;
    maxProfit=Math.max(maxProfit,profit);
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
//if solved using stack element.
//if stack is empty return -1 qnd push the element into the stack .
//if array element<stack element, then return stackm element.and push array element.
//if peek element is smaller pop.then again compare with arr element and stack element then return if stack element greater.
//follow same 
// this is called monotonic stack.