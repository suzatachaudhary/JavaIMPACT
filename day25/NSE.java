//next smallest element in array using monotonic stack
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class NSE
{ 
   private static int[] arr={3,2,6,7,1,8};
   private static int top=-1;
   private static int[] stack=new int[arr.length];
   private static List<Integer> result=new ArrayList<>();

   public static void main(String args[])
   {
    NSE.nextSmallerNumber(arr);
   }
   public static boolean isEmpty()
   {
    return top==-1;
   }
   public static void push(int data)
   {
    if(top >=arr.length-1)
    {
      System.out.println("Stack overflow");
    }
    else
    {
      top += 1;
      stack[top]=data;
    }
   }
    public static void pop()
    {
      if(isEmpty())
      {
        System.out.println("Stack is empty");
      }
      else
      {
        top -= 1;
      }
    }
    public static void nextSmallerNumber(int[] arr)
    {
      for(int i=arr.length-1;i>=0;i--)
      {
        if(isEmpty())
        {
          result.add(-1);
          push(arr[i]);
        }
        else
        {
          while(top >= 0)
          {
           if(arr[i]<stack[top])
           {
             pop();
             if(isEmpty())
             {
              result.add(-1);
              push(arr[i]);
              break;
             }
           }
           else
           {
             result.add(stack[top]);
             push(arr[i]);
             break;
           }
          }
        }
      }
      Collections.reverse(result);
      System.out.println(result);
    }
}
