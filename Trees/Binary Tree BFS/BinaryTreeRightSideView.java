// LC 199. Binary Tree Right Side View
// Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

// Example 1:

// Input: root = [1,2,3,null,5,null,4]
// Output: [1,3,4]
// Example 2:

// Input: root = [1,null,3]
// Output: [1,3]
// Example 3:

// Input: root = []
// Output: []
 
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

// Solution:

// I'm using a breadth-first search (BFS) traversal of the binary tree. This is a suitable choice for this problem as it allows me to traverse level by level, ensuring that I see the rightmost node on each level first.

// I'm using a queue to perform the BFS traversal. I start by adding the root node to the queue.

// Inside the while loop, I process each level of the binary tree. For each level, I iterate through the nodes on that level, adding the value of the first node (rightmost node) to the list l.

// During each iteration, I check if the current node has a right child. If it does, I enqueue the right child, ensuring that I process the right child nodes first for the next level.

// Similarly, I check if the current node has a left child. If it does, I enqueue the left child. However, I enqueue the left child after the right child to ensure that nodes are processed from right to left, and only the rightmost node at each level is added to the list l.

// Finally, I return the list l, which contains the values of the nodes I can see from the right side of the binary tree.
