//check if array is sorted or not production level.
class sortedArray
{
  String sorted(int[] arr)
  { 
    int flag=0;
    int size=arr.length;
    for(int i=0;i<arr.length-1;i++)
    { 
      if(arr[i]>arr[i+1])
      {
        flag=1;
      }
    }
    if(flag==0)
    {
      return "Sorted";
    }
    else
    {
      return "Unsorted";
    }
  }

  public static void main(String args[])
  {
    int[] arr={4,5,8,9};
    sortedArray obj=new sortedArray();
    System.out.println(obj.sorted(arr));
    
    
  }
}