import java.util.ArrayList;
import java.util.List;
class CircularNGE
{ 
  private static int[] arr={9,2,7,0,8,1};
  private static int top = -1;
  private static List<Integer> result=new ArrayList<>();
  private static int[] stack=new int[arr.length];

  public static void main(String args[])
  {
    CircularNGE.nextgreaterCircular(arr);
  }
  public static boolean isEmpty()
  {
    return top==-1;
  }
  public static void push(int data)
  {
    if(top>=arr.length)
    {
      System.out.println("Stack is full");
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
  public static int peek()
  {
    return stack[top];
  }
  public static void nextgreaterCircular(int[] arr)
   {  
    for(int i = 2 * arr.length - 1; i >= 0; i--) 
    {  
        int index = i % arr.length;

        while(top != -1 && stack[top] <= arr[index]) 
        {  
            pop();
        }

        if (i < arr.length) 
        {   // Ensure results are added only once
            if (isEmpty()) 
            {  
                result.add(-1);
            } else 
            {  
                result.add(peek());
            }
        }

        push(arr[index]); // Push only after checking NGE
    }

    // Reverse result manually to match original order
    for (int i = 0, j = result.size() - 1; i < j; i++, j--)
     {  
        int temp = result.get(i);
        result.set(i, result.get(j));
        result.set(j, temp);
     }

    System.out.println(result);
  }
}