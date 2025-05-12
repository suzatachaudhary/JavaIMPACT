import java.util.ArrayList;
import java.util.List;
class Leader{
  public static void main(String[] args)
  {
    int[] arr = {11, 3, 5, 9, 4,6};   //if all next element are smaller than the element then it is a leader.
    int leader=0;
    List<Integer> leaders=new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          leader++;
        }
      }
      if(leader==arr.length-(i+1))
        {
          leaders.add(arr[i]);
          //System.out.print(arr[i]+" ");
        }
      leader=0;
    }
    System.out.println(leaders);
  }
}