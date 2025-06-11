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
    public int minDepth(TreeNode root) {
        if(root == null ) return 0;
        int left_minDepth=Integer.MAX_VALUE;
        int right_minDepth=Integer.MAX_VALUE;
        
        if(root.left != null && root.right != null)
        {
            left_minDepth=minDepth(root.left);
            right_minDepth=minDepth(root.right);
        }
        if(root.left==null)
        {
            right_minDepth=minDepth(root.right);
        }
        if(root.right==null)
        {
            left_minDepth=minDepth(root.left);
        }

        if(left_minDepth<right_minDepth)
        {
            return left_minDepth +1;
        }
        else
        {
            return right_minDepth + 1;
        }
    }
}