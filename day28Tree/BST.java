//just add these in actual code.
public void populate(Scanner in)
{
  System.out.println("Enter numbers to insert into BST (-1 to stop):");
  while(true)
  {
    int value=in.nextInt();
    if(value==-1) break;
    insert(value);
  }
}

public void insert(int value)
{
  root=insert(root, value);
}
//binary search tree we won't get duplicates.
private void insert(Node node , int value)
{
  if(node == null)
  {
    return new Node(val);
  }

  if(value<node.data)
  {
    node.left=insert(node.left,value);
  }
  else if(value>node.data)
  {
    node.right=insert(node.right,value);
  }
  return node;
}