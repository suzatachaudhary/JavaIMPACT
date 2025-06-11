//Using inorder Traversal.
class ValidateBST{
    public boolean isValidBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrderTraversal(root, list);

        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>=list.get(i+1))
            {
               return false;
            }
        }
        return true;
    }
    private void inOrderTraversal(TreeNode node, List<Integer> list)
    {
      if(node == null) return;

      inOrderTraversal(node.left,list);
      list.add(node.val);
      inOrderTraversal(node.right,list);
    }
}

class ValidateBST{
   public boolean isValidBST(TreeNode root)
    {

      return isValidBST(root);

   }

   private boolean isValidBST(TreeNode node)
   {
    if(node == null) return true;

    if(node.left != null && node.left.val>=node.val) return false;
    if(node.right != null && node.right.val<=node.val) return false;

    return isValidBST(node.left) && isValidBST(node.right);
   }
}