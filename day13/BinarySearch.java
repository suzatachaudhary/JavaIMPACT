//Binary Search
// the array should be sorted
//time complexity will be O(log n)
import java.util.Arrays;
class BinarySearch{
  public static void main(String args[])
  {
    int[] arr={1,2,3,4,5,6};
    int target=6;
    int low=0;
    int high=arr.length-1;
    while(low<=high)
    {
      int mid=low+(high-low)/2;
      if(arr[mid]==target)
      {
        System.out.println(mid);
        break;
      }
      else if(arr[mid]<target)
      {
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
  }
}