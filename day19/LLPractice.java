// practice
class Node
{
  int data;
  Node next;    //Node is inbulit data type for storing data as well as value. 
  
  Node(int data1)   //first condition for only single element in list
  {
    this.data = data1;
    this.next=null;
  }
  Node(int data1, Node next1)   // node in between list.
  {
    this.data=data1;
    this.next=next1;
  }
}

class LLPractice
{
  static Node conversionOfArrayToLinkedlist(int[] arr)
  {
    Node head=new Node(arr[0]);  //storing arr[0] in head
    Node current=head;           // storing head in current as we wil need head in future to traverse the linked list. so storing value of head in current.
    for(int i=1;i<arr.length;i++)    
    {
      Node temp=new Node(arr[i]);  // creating all other nodes 
      current.next=temp;           //arr[1] becomes next of arr[0]
      current=temp;                 // arr[1] becomes current for next loop so on.
    }
    return head;
  }
  //printing the elements staring from head , head stored in temp variable . printing it untll temp becomes null.
  static void printfunction(Node head)
  {
    Node temp=head;
    while(temp != null)
    {
      System.out.print(temp.data + ((temp.next != null ? "-->":"-->Null")));
      temp=temp.next;
    }
  }
  public static void main(String args[])
  {
    int[] arr={9,5,7,8,3,2,5,0};
    Node head=conversionOfArrayToLinkedlist(arr);
    printfunction(head);
  }
}