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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        postorder(root,l);
        return l;
    }
    public void postorder(TreeNode root,List<Integer> l){
        if(root == null){
            return;
        }
        postorder(root.left,l);
        postorder(root.right,l);
        l.add(root.val);
    }
}
