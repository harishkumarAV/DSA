/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        if(root == null){
            return Integer.MAX_VALUE;
        }
        while(root.left!=null){
            root = root.left;
        }
        return root.data;
    }
}
