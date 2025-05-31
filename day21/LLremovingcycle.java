//for deleting cycle in loop.
static Node deletingCycle(Node head, Node fast, Node slow)
{
  slow=head.next;
  while(fast.next !=slow)
  {
    fast=fast.next;
    slow=slow.next;
  }
  fast.next=null;
  return head;
}
// for printing no of nodes in loop.
static int PrintingNodeOfLopp(Node head, Node fast, Node slow)
    {
        int count=1;
        fast=fast.next;
        while(fast != slow)
        {
            fast=fast.next;
            count++
        }
        return count;
    }