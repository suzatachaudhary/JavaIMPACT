//Leader problem using single loop. to reduce time compleixty start from the end of the array.
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Leader1{
  public static List<Integer> findLeaders(int[] arr)
  {
       
    List<Integer> leaders=new ArrayList<>();
    int minExtreme = Integer.MIN_VALUE;
    for(int i=arr.length-1;i>=0;i--)
    {
     if(arr[i] > minExtreme)
     {
      leaders.add(arr[i]);
      minExtreme=arr[i];
     }
    }
    Collections.reverse(leaders);   //inbuilt method to reverse the list.
    return leaders;
    }

    public static void main(String args[])
    {
     int[] arr = {11, 3, 5, 9, 4,6};
     //if all next element are smaller than the element then it is a leader.
     System.out.println("Leaders in given array are: " + findLeaders(arr));

    }
}

