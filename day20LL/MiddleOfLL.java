//initialize a slow pointer and fast pointer.
class Node{
  int data;
  Node next;

  Node(int data)
  {
    this.data=data;
    this.next=null;
  }
  Node(int data, Node next)
  {
    this.data=data;
    this.next=next;
  }
}
class MiddleOfLL
{
  static Node conversionOfArrayToLinkedlist(int[] arr)
  {
    Node head=new Node(arr[0]);
    Node current=head;

    for(int i=1;i<arr.length;i++)
    {
      Node temp=new Node(arr[i]);
      current.next=temp;
      current=temp;
    }
    return head;
  }

  static void printFunction(Node head)
  {
    Node temp=head;
    while(temp != null)
    {
      System.out.print(temp.data+ ((temp.next != null ? "-->":"-->null")));
      temp=temp.next;
    }
  }
  static int findMiddle(Node head)
  {
    Node slow = head;
    Node fast = head;
    while(fast != null)   //(fast != null && fast.next != null) for odd linkedlist.
    {
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow.data;
  }
  public static void main(String args[])
  {
    int[] arr={9,5,7,8,3,2,5,0};
    Node head=conversionOfArrayToLinkedlist(arr);
    System.out.println(findMiddle(head));
  }
}