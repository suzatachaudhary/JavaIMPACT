class SegmentTree
{
    class Node
      {
        int data;
        Node left;
        Node right;
        int startIndex;
        int endIndex;
        Node(int data1,int startIndex1,int endIndex1){
            this.data=data1;
            this.startIndex=startIndex1;
            this.endIndex=endIndex1;
      }
      }

    private Node root;
    static void createTree(){
        root=helperTree();
    }

    static void helperTree(Node root,int startIndex,int endIndex)
    {
        if(startIndex==endIndex){
            Node left =new Node(arr[endIndex]);
            return;
        }
        startIndex=0;
        endIndex=arr.length-1;
        int mid = startIndex+endIndex /2;
        
        Node.left=helperTree(arr,startIndex,endIndex);
        Node.right=helperTree(arr,mid+1,endIndex);
        Node.data=Node.left.data+Node.right.data;
    }

    static void query(Node root, int inputLeft, int inputRight)
    {
      if(startIndex >= inputLeft && endIndex <= inputRight)//with in range
      {
        return node.data;
      }
      if(startIndex > inputRight || endIndex < inputLeft)  // out of bound
      {
        return 0;
      }
      else{ //overlapping
        return this.query(Node node.left, inputLeft, inputRight) + this.query(Node node.right, inputLeft, inputRight)
      }
    }

    
}