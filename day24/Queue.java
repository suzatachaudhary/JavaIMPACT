import java.util.Arrays;
class Queue
{ 
  private static int size=5;
  private static int[] arr = new int[5]; 
  private static int start = -1;
  private static int end = -1;
  public static void main(String args[])
  { 
    System.out.println(Queue.isEmpty());
    Queue.offer(10);
    Queue.offer(20);
    Queue.offer(30);
    Queue.offer(40);
    Queue.offer(50);
    System.out.println(Queue.Display());
    Queue.offer(70);
    int a=Queue.poll();
    int b=Queue.poll();
    int c=Queue.poll();
    System.out.println(Queue.Display());
    System.out.println(Queue.SizeOfQueue());


  }
  static boolean isEmpty()
  {
    if(start==-1 && end==-1)
    {
      return true;
    }
    return false;
  }

  static void offer(int data) //enqueue
  {
      if ((end + 1) % size == start) 
      { 
            System.out.println("Queue overflow");
            return;
      }
      if (start == -1) { 
          start = 0;
          end = 0;
      } else {
          end = (end + 1) % size;
      }
      arr[end] = data;

  }
  static int poll()  //dequeue
  {
    if (isEmpty()) 
    {
      System.out.println("Queue underflow");
      return -1;
    }
    int deleted = arr[start];
    if (start == end)
     { 
        start = -1;
        end = -1;
    } else {
        start = (start + 1) % size;
    }
    return deleted;
  }


  static int SizeOfQueue()
  { 
    if(isEmpty())
    {
      return 0;
    }
    return end-start+1;
  }

  // static String Display()
  // {
  //   return Arrays.toString(arr);
  // }
  static String Display() {
    if (isEmpty()) return "Queue is empty";

    StringBuilder result = new StringBuilder("[");
    int i = start;
    while (true) {
        result.append(arr[i]);
        if (i == end) break; 
        result.append(", ");
        i = (i + 1) % size; 
    }
    result.append("]");
    return result.toString();
}
}