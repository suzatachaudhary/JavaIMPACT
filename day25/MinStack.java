import java.util.HashMap;
import java.util.Map;
class MinStack
{ 
  private static int[] arr={5,3,6,2,9,8};
  private static HashMap<Integer,Integer> stack=new HashMap<>();
  public static void main(String args[])
  {
    System.out.println(MinStack.Minstack(arr));
  }
  public static int Minstack(int[] arr)
  {
   int left=0;
   int MinStack=Integer.MAX_VALUE;
   while(left<arr.length)
   {
     if(arr[left]<MinStack)
     {
      MinStack=arr[left];
     }
     stack.put(arr[left],MinStack);
     left++;
   }
   return MinStack;
  }
}