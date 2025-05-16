import java.util.Arrays;
class SortingArray
{
  public static void main(String[] args)
  {
    int[] arr={1,0,2,1,2,0,2,1,0,1};    //using three pointer two pointer start from index and one from last index.  // loop while(i<j)
    int l=0;
    int start=0;
    int end=arr.length-1;

    while(start<end)
    {
      if(arr[start]==0)
      {
        int temp=arr[start];
        arr[start]=arr[l];
        arr[l]=temp;
        l++;
        start++;
      }
      else if(arr[start]==1)
      {
        start++;
      }
      else if(arr[start]==2)
      {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        end--;
      }
    }
    System.out.print("[");
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
      System.out.print(", ");
    }
   }
    System.out.println("]");

   System.out.println(Arrays.toString(arr));

  }
}
// // if 1 dont swap stay the value there only just move the pointer(m)
// if 1 swap with previous pointer l and m .m++ and l++.
// if 2 swap with h and m. then decrease h.  follow the same rules until m<h.  (touch national flag algo)

// ## touch national flag 
// -->  take the array with 0 , 1, and 2 ,unsorted.
// 1. Initialize l pointer in 0th index.
// 2. Initialize h pointer in last index(n-1).
// 3. Initialize m pointer in 0th index.
// 4. the elements between m and h are not sorted. so we have to run a loop from m to h.if both crosses, it means we are reaching each and every elements.
// 5.if array of m is 0.swap arr[m] and arr[l].after swapping increase m and increase l.
// 6.if array of m is 1. do nothing and just increase m pointer.
// 7.if array of m is 2. swap arr[m] and arr[h].after swapping decrease h pointer.
