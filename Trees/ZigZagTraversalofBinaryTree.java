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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null){
            return l;
        }

        boolean odd = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int  size = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(odd){
                    temp.add(curr.val);
                }else{
                    temp.addFirst(curr.val);
                }
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            l.add(temp);
            odd=!odd;
        }
        return l;
    }
}
