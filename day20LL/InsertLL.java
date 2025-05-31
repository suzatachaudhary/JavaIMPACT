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

class InsertLL
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
  static Node InsertAtHead(Node head, int data)
  {
    Node newNode= new Node(data);
    newNode.next=head;
    head=newNode;
    return head;
  }
  static Node InsertAtTail(Node head, int data)
  { 
    Node newNode=new Node(data);
    Node temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=newNode;
    return head;
  }

  static Node InsertAtNthNode(Node head,int data,int n)
  {
    Node newNode=new Node(data);
    Node temp=head;
    Node prev=null;
    int count=1;
    while(temp != null)
    {
      if(count==n)
      {
        prev.next=newNode;
        newNode.next=temp;
      }
      prev=temp;
      temp=temp.next;
      count++;
    }
    return head;
  }

  static Node insertByValue(Node head, int data, int n)  //n is element.
  {
    Node newNode = new Node(data);
    Node temp = head;
    Node prev = null;
    while(temp != null)
    {
    if(temp.data == n)
    { 
      newNode.next = temp; 
      prev.next=newNode;
    }
    prev=temp;
    temp=temp.next;
    }
    return head;
  }
  public static void main(String args[])
  {
    int[] arr={1,2,3,6};
    Node head=convertArrayToLinkedList(arr);
    head=InsertAtHead(head,0);
    head=InsertAtNthNode(head, 4,3);
    head=InsertAtTail(head,6);
    head=insertByValue(head,7,6);
    print(head);

  }
}
