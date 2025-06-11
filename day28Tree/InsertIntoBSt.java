/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val)
    {
        return insertion(root,val);
    }
    private TreeNode insertion(TreeNode node, int val)
    {
        if(node == null) return new TreeNode(val);

        if(val<node.val)
        {
            if(node.left != null)
            {
                insertion(node.left,val);
            }
            else
            {
                node.left =new TreeNode(val);
            }
        }
        else if(val>node.val)
        {
            if(node.right != null)
            {
                insertion(node.right,val);
            }
            else
            {
                node.right=new TreeNode(val);
            }
        }
        return node;
    }
}