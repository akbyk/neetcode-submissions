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
    public int[] max = new int[1];

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        max[0] = Math.max(maxDepth(root.right) + maxDepth(root.left), max[0]);

        diameterOfBinaryTree(root.right);
        diameterOfBinaryTree(root.left);
        
        return max[0];
    }

    public int maxDepth(TreeNode root) {
            if (root == null){
                return 0;
                }
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
}
