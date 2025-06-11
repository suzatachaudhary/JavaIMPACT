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
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root)
//     { 
//        List<Integer> list = new ArrayList<>();
//        helper(root, list);
//        return list;  
//     }
//     private void helper(TreeNode node, List<Integer> list)
//     {  
//         if(node==null) return;
//         Queue<TreeNode> queue= new LinkedList<>();
//         queue.offer(node.data);
//         while(!queue.isEmpty())
//         {   
//             int temp=queue.poll();
//             list.add(temp.data);
//             if(temp.left != null) queue.offer(temp.left);
//             if(temp.right != null) queue.offer(temp.right);
//         }
//     }
// }
//in level wise in nested list .leetcode problem no:102
import java.util.*;

class LevelOrderTraversal { 
    public List<List<Integer>> levelOrder(TreeNode root) {  
        List<List<Integer>> result = new ArrayList<>(); 
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) { 
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();
                levelList.add(temp.val);

                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
            }

            result.add(levelList);
        }
        return result;
    }
}