import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> MainList = new ArrayList<>();
        List<Integer> tempList1 = new ArrayList<>();
        List<Integer> tempList2 = new ArrayList<>();
        List<Integer> tempList3 = new ArrayList<>();
        
        Inorder(root, tempList1);
        PreOrder(root, tempList2);
        PostOrder(root, tempList3);
        
        MainList.add(tempList1);
        MainList.add(tempList2);
        MainList.add(tempList3);
        
        return MainList;
    }
    
    public static void Inorder(TreeNode root, List<Integer> tempList1) {
        if (root == null) {
            return;
        }
        Inorder(root.left, tempList1);
        tempList1.add(root.data);
        Inorder(root.right, tempList1);
    }
    
    public static void PreOrder(TreeNode root, List<Integer> tempList2) {
        if (root == null) {
            return;
        }
        tempList2.add(root.data);
        PreOrder(root.left, tempList2);
        PreOrder(root.right, tempList2);
    }
    
    public static void PostOrder(TreeNode root, List<Integer> tempList3) {
        if (root == null) {
            return;
        }
        PostOrder(root.left, tempList3);
        PostOrder(root.right, tempList3);
        tempList3.add(root.data);
    }
}
