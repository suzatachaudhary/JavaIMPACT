import java.util.Scanner;

class BinaryTree
{
    static class Node
    {
      int data;
      Node left;
      Node right;

      Node(int data1)
      {
        this.data=data1;
        this.left=null;
        this.right=null;
      }
    }

    private static Node root;
    
    void createTree(Scanner in)
    {
      System.out.println("Enter the root value:-");
      int val=in.nextInt();
      Node root = new Node(val);
      helperTree(in, root);
      display(root);
      preOrder(root);
      System.out.println();
      inOrder(root);
      System.out.println();
      postOrder(root);
    }

    private void helperTree(Scanner in,Node node)
    {
      System.out.println("Do you want to add at left of: " + node.data);
      boolean left=in.nextBoolean();
      if(left)
      {
        System.out.println("Enter the left val:-"+node.data);
        int val=in.nextInt();
        node.left=new Node(val);
        helperTree(in, node.left);
      }
    

      System.out.println("Do you want to add at right of : " + node.data);
      boolean right=in.nextBoolean();
      if(right)
      {
        System.out.println("Enter the right val:-"+ node.data);
        int val=in.nextInt();
        node.right=new Node(val);
        helperTree(in, node.right);
      
      }
    }

    void display()
    {
      display(root);

    }
    private void display(Node node)
    {
      if(node == null)
      {
        return;
      }
      System.out.print(node.data +" ");
      display(node.left);
      display(node.right);
    }
    void preOrder()
    {
      preOrder(root);
      System.out.println();
    }
    private void preOrder(Node node)
    {
      if(node == null) return;
      System.out.print(node.data);
      preOrder(node.left);
      preOrder(node.right);
    }
    
    void inOrder()
    {
      inOrder(root);
      System.out.println();
    }
    private void inOrder(Node node)
    {
      if(node == null) return;
      
      inOrder(node.left);
      System.out.print(node.data);
      inOrder(node.right);
    }
    void postOrder()
    {
      postOrder(root);
      System.out.println();
    }
    private void postOrder(Node node)
    {
      if(node == null) return;
      
      postOrder(node.left);
      System.out.print(node.data);
      postOrder(node.right);
    }

    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      BinaryTree tree=new BinaryTree();
      tree.createTree(in);
    }
}