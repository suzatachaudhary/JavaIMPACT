//using binary Search.

class MinElemnt
{
  public static void main(String args[])
  {
    int[] arr={6,5,1,2,3,4};
    int left=0;
    int right=arr.length-1;
    
    while( left <= right)
    {  
      int mid= left+(right-left)/2;
      if(arr[mid]<arr[right]) 
      {
        
            right = mid; 
      }
      else 
      {
            left = mid+1; 
      }
    }
    System.out.println(arr[right]);
  }
}