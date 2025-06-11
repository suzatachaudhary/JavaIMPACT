//{10,2,8,9,6,11}  -->{-1,-1,2,8,2,6}
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class PreviousSmallestElement
{
  private static int[] arr={10,2,8,9,6,11};
  private static int top=-1;
  private static List<Integer> result=new ArrayList<>();
  private static int[] stack=new int[arr.length];

  public static void main(String args[])
  {
     PreviousSmallestElement.PreviousSmallEle(arr);
  }
  public static boolean isEmpty()
  {
    return top == -1;
  }

  public static void push(int data)
  {
    if(top>=arr.length-1)
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
      System.out.println("Stack is Empty");
    }
    else
    {
      top -= 1;
    }
  }

  public static void PreviousSmallEle(int[] arr)
  {
    for(int i=0; i<arr.length; i++)
    {
      if(isEmpty())
      {
        result.add(-1);
        push(arr[i]);
      }
      else{
        while(top>=0)
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
    System.out.println(result);
  }
}
