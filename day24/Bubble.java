import java.util.Arrays;
class Bubble
{
  public static void main(String[] args) 
  {
    int[] arr = {5,3,2,1,4};
    System.out.println(bubbleSort(arr));
  }


  public static void swap(int[] arr,int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]= temp;
  }
  public static String bubbleSort(int[] arr)
  {
    for(int i=0;i<arr.length-1;i++)
    {
      for(int j=0;j<arr.length-i-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          swap(arr,j,j+1);
        }
      }
    }
    return Arrays.toString(arr);
  }
  
  
}