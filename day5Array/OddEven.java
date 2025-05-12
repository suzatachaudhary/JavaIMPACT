/* odd and even count. Max in array and 2nd max in array in both optimized i.e O(n) and O(2n) time complexity.*/

class OddEven{
  public static void main(String args[])
  {
    int[] arr={1,9,18,23,9,34,34};
    int oddCount=0;
    int evenCount=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==0)
      {
        evenCount++;
      }
      else{
        oddCount++;
      }
    }
System.out.println("Even count is: "+evenCount);
System.out.println("Odd count is: "+ oddCount);
int max=0;
int secondMax=0;
for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>max)
      { 
        secondMax=max;
        max=arr[i];
      }
      else if(arr[i] > secondMax && arr[i]<max)     //edge case it will help in leetcode type of problem to satisfy all the condition but here even without else if it is working.
      {
        secondMax=arr[i];
      }
    }
System.out.println("max value is: "+ max);
/*
for(int i=0;i<arr.length;i++)
{
  if(arr[i]>secondMax && arr[i]<max)
  {
    secondMax=arr[i];
  }
}*/
System.out.println("Second greatest value is: "+ secondMax);
  }
}