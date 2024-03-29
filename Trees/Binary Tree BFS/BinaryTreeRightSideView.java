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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList();
        if(root==null){
            return l;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                if(i==0){
                    l.add(curr.val);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
            }
        }
        return l;
    }
}
