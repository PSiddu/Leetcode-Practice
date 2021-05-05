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
    public int maxDepth(TreeNode root) {
        
        // base case, when the root is null, return zero (since there is no node)
        if (root == null) {
            return 0;
        }
        else {
            
            // return the max depth of the left and right nodes of root recursively
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        
    }
}
