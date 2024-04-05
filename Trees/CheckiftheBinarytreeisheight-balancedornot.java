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
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftval = maxDepth(root.left);
        if(leftval == -1){
            return -1;
        }
        int Rightval = maxDepth(root.right);
        if(Rightval == -1){
            return -1;
        }
        if(Math.abs(leftval - Rightval) > 1){
            return -1;
        }
        return 1 + Math.max(leftval,Rightval);
    }
}
