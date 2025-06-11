class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
       return LCA(root, p, q);
        
    }
    private TreeNode LCA(TreeNode node, TreeNode p, TreeNode q)
    {
       if(node == null) return null;

       if(p.val==node.val || q.val==node.val)
       {
        return node;
       }
       else
       {
         if(p.val<node.val && q.val<node.val)
         {
            return LCA(node.left, p, q);
         }
         else if(p.val>node.val && q.val> node.val)
         {
            return LCA(node.right, p, q);
         }
         else
         {
           return node;
         }
       }
    }
}