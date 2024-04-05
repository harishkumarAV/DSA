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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return diameter;
    }
    public int find(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftval = find(root.left);
        int rightval = find(root.right);

        diameter = Math.max(diameter , leftval + rightval);
        return 1 + Math.max(leftval , rightval);
    }
}
