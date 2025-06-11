//level order traversal
//Queues can be created using linkedlist, ArrayList, Stacks
//offer is for enqueue, poll is for dequeue, peek is for front of queue, isEmpty is for checking if queu.

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
class BFS
{
    static class Node
    {
      int data;
      Node left, right;

      Node(int data1)
      {
        this.data=data1;
        this.left=null;
        this.right=null;
      }
    }
    private static Node root;
    static void createTree(Scanner in)
    {
      System.out.println("Enter the value of root:-");
      int val=in.nextInt();
      Node node=new Node(val);
      HelperTree(in, root);
      display();
      bfs(root);

    }
    private void HelperTree(Scanner in, Node node)
    {
      System.out.println("Do you want to add at left of:-"+node.data);
      boolean left = in.nextBoolean();
      if(left)
      {
        System.out.println("Enter the value of left:-");
        int val=in.nextInt();
        node.left=new Node(val);
        HelperTree(in,node.left);
      }

      System.out.println("Do you want to add at right of:-"+node.data);
      boolean right = in.nextBoolean();
      if(right)
      {
        System.out.println("Enter the value of left:-");
        int val=in.nextInt();
        node.right=new Node(val);
        HelperTree(in, node.right);
      }
    }

    void display()
    {
      display(root);
    }
    private void display(Node node)
    {
      if(node==null) return;
      
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }
    public void bfs(Node root)
    { 
      if(root == null) return;
      Queue<Node> queue=new linkedlist<>();
      queue.offer(root);
      while(!queue.isEmpty())
      {
        Node temp=queue.poll();
        System.out.println(temp.data);

        if(temp.left != null) queue.offer(temp.left);
        if(temp.right != null) queue.offer(temp.right);
      }
    }
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      BFS tree=new BFS();
      tree.createTree(in);


    }
}