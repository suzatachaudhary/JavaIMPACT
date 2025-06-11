//actual implementation 
import java.util.Scanner;

class AVLTree {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value)
        {
            this.value = value;
        }
    }

    private Node root;
    private int height(Node node)
    { 
      if(node == null) return 0;
      if(node.left==null && node.right==null ) return 0;

      left_height=height(node.left);
      right_height=height(node.right);

      if(left_height>right_height)
      {
        return left_height;
      }
      else
      {
        return right_height;
      }
    }

    private void BalancingFactor(Node node)
    {
      if(node==null) return;
      int balancing_factor=height(node.left)-height(node.right);
      if(balancing_factor != 0 || balancing_factor != 1 || balancing_factor != 1)
      {
        if((height(node.left)-height(node.right))>1)
        {
          if((height(node.left.left)-height(node.left.right))>0)
          {
            return rightrotate(node);
          }
          if((height(node.left.left)-height(node.left.right))<0)
          {
            node.left=leftrotate(node);
            return rightrotate(node);
          }
        }
        if((height(node.left)-height(node.right))<1)
        {
          if((height(node.right.right)-height(node.right.left))>0)
          {
            return rightrotate(node);
          }
          if((height(node.right.rightt)-height(node.right.left))<0)
          {
            node.right = right(node);
            return leftrotate(node);
          }
        }
      }      
    }
    private void L_L(Node )
    public void populate(Scanner in) 
    {
        System.out.println("Enter numbers to insert into BST (-1 to stop):");
        while (true)
        {
            int value = in.nextInt();
            if (value == -1) break;
            insert(value);
        }
    }
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) 
         x{
            return new Node(value);
         }
        if (value < node.value)
         {
            node.left = insert(node.left, value);
         } 
        else if (value > node.value) 
         {
            node.right = insert(node.right, value);
         }
        // If value == node.value, ignore to avoid duplicates.
        return node;
    }

    public void display() {
        System.out.println("Tree structure:");
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void preOrder() {
        System.out.print("Pre-order: ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        bst.populate(in);
        bst.display();
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
    }
}