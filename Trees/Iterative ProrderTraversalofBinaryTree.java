import java.util.*;

public class Solution {

    public static void preOrder(BinaryTreeNode<Integer> root) {
        List<Integer> l = new ArrayList<>();
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode<Integer> topnode = stack.pop();
            l.add(topnode.data);
            if (topnode.right != null) {
                stack.push(topnode.right);
            }
            if (topnode.left != null) {
                stack.push(topnode.left);
            }
        }

        for (Integer value : l) {
            System.out.print(value + " ");
        }
    }
}
