//follow up question odd even by value not index.

static Node oddAnEven(Node head)
{
  Node oddStart, oddEnd, evenStart, evenEnd=null;
  Node temp=head;

  while(temp != null)
  {
    if(temp.data % 2 == 0)
    {
      if(evenStart== null)
      {
        evenStart = temp;
        evenEnd = evenStart;
      }
      else
      {
        evenEnd.next=temp;
        evenEnd=temp;
      }
    }
    else
    {
      if(oddStart== null)
      {
        oddStart = temp;
        oddEnd=oddStart;
      }
      else{
        oddEnd.next=temp;
      oddEnd=temp;
      }
    }
    temp=temp.next;
  }
  if(evenStart  == null) return oddStart;
  if(oddStart == null) return evenStart;

  oddEnd.next = evenStart;
  evenEnd.next=null;

  return oddStart;


}