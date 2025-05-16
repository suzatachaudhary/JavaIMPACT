//[1,0,1,0,1,0] move all zeros to right side[1,1,1,0,0,0]
import java.util.Arrays;
class Ques{
  public static void main(String args[])
  {
    int[] arr={1,0,1,0,1,0};
    int start=0;
    int end=arr.length-1;

    while(start<end)
    {
      if(arr[start]==0 && arr[end]==1)
      {
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
        start++;
        end--;
      }
      else if(arr[start]==0 && arr[end]==0)
      {
        end--;
      }
      else
      {
        start++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}

