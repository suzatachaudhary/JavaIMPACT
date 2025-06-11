//leetcode problem.
class Solution
 {
    public TreeNode searchBST(TreeNode root, int val) 
    {

       return searchInBST(root,val);
        
    }
    private TreeNode searchInBST(TreeNode node, int val)
    {
        if(node == null) return null;
        if(node.val == val)
        {
            return node;
        }
        
        if(val<node.val)
        {
             return searchInBST(node.left,val);
        }
        else
        {
            return searchInBST(node.right,val);
        }
    }
}