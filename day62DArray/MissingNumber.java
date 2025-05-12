//find the missing number in an sorted array[1,2,3,5,6,7,8,9]

class MissingNumber{
  public static void main(String args[])
  {
    int[] arr={1,2,3,5,6,7,8,9};
    for(int i=0;i<arr.length-1;i++)
    {
      if (arr[i]+1 != arr[i+1])
      {
        System.out.println(arr[i]+1);
      }
    }
    
  }
}