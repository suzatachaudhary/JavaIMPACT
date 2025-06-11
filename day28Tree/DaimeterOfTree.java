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
//leetcode problem
class Solution {
    private int MaxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        SumOfHeightOfTree(root);
        return MaxDiameter;
        
    }
    private int SumOfHeightOfTree(TreeNode node)
    {   
        if(node ==null) return 0;

        int left_height=SumOfHeightOfTree(node.left);
        int right_height=SumOfHeightOfTree(node.right);

        MaxDiameter=Math.max(MaxDiameter, left_height+right_height);

        return Math.max(left_height,right_height)+1;
    }
}