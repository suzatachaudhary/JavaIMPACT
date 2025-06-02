import java.util.Arrays;
class SelectionSort
{
  public static void main(String args[])
  {
    int[] arr={7, 1, 4, 9, 0};
    System.out.println(selectionSort(arr));

  }
  static void swap(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  static String selectionSort(int[] arr)
  {
    for(int i=0;i<arr.length-1;i++)
    {
      int SI= i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[j]<arr[SI])
        {
          SI=j;
        }
      }
      swap(arr, i, SI);
    }
    return Arrays.toString(arr);
  }
}