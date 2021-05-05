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
        
        // base case, when the root is null, return zero (since there is no node)
        if (root == null) {
            return 0;
        }
        // when both children are null, just return 1 (because the return 0 would throw off number)
        else if (root.left == null && root.right == null) {

                return 1;
        }
        // if there is no left node, then continue with right node (because 0 will throw off)
        else if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        // if there is no right node, then continue with left node (because 0 will throw off)
        else if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        
        // if both are present and above 0, then go with lowest one as expected
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
