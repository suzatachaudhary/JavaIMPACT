//delete operation in LinkedList
class Node
{
  int data;
  Node next;

  Node(int data1)
  {
    this.data=data1;
    this.next=null;
  }
  Node(int data1, Node next1)
  {
    this.data=data1;
    this.next=next1;
  }
}

class CRUDLL
{ 
  static Node convertArrayToLinkedList(int[] arr)
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
  static void print(Node head)
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data + ((temp.next != null ?"-->":"-->Null")) );
      temp=temp.next;
    }
  }
  static Node deleteHead(Node head)
  {
    Node temp=head;
    head=temp.next;
    // head.prev=null;   for doubly linked list
    // temp.next=null;
    return head;
  }

  static Node deletetail(Node head)
  {
    Node temp=head;
    while(temp.next.next != null)
    {
      temp=temp.next;
    }
    temp.next=null;
    return head;
  }
  
  static Node DeleteNthNode(Node head, int n)
  {
    int count=1;
    Node temp=head;
    Node prev=null;
    
    while(temp != null)
    { 
      if(count == n)
      {
        prev.next=temp.next;
        temp.next=null;
      }
      prev=temp;
      temp=temp.next;
      count++;
    }
    return head;
  }

   static Node DeleteNodeByValue(Node head, int value)
  {
    Node temp=head;
    Node prev=null;
    
    while(temp != null)
    { 
        if(temp.data==value)
        {
        prev.next=temp.next;
        temp.next=null;
        }
        prev=temp;
        temp=temp.next;
    }
    return head;
  }

  public static void main(String args[])
  {
    int[] arr={9,2,3,4,5};
    Node head=convertArrayToLinkedList(arr);
    head=deleteHead(head);
    head=deletetail(head);

    print(head);
  }
}
