//leetcode 110
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
class BalancedTreeOrNot {
    public boolean isBalanced(TreeNode root)
     {
       
        return CalculateBalance(root) != -1;
    }
    private int CalculateBalance(TreeNode node)
    {
        if(node == null) return 0;
        int left_height=CalculateBalance(node.left);
        int right_height=CalculateBalance(node.right);
        if (left_height == -1 || right_height == -1){
            return -1;
        };
        int Difference = Math.abs(left_height-right_height);
        if(Difference > 1)
        {
          return -1;
        }
        return Math.max(left_height,right_height)+1;
    }
}