package BinaryTree;

import java.util.ArrayList;

public class PathSumTarget {
    public static void main(String a[]) throws Exception {
        TreeNode root = BSTHelper.createBst();
        PathSumTarget obj = new PathSumTarget();
        boolean isFound = false;
        PrintingBinaryTreeZigZagBFS obj2 = new PrintingBinaryTreeZigZagBFS();
        for (ArrayList<Integer> i : obj2.bfsZigzag(root)) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.print('\n');
        }
        System.out.println(obj.hasPathSum(root, 7));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root, targetSum, 0);
    }

    private boolean hasPathSumHelper(TreeNode node, int targetSum, int currSum){
        if(node == null){
            return false;
        }
        if(node.left == null && node.right == null){
            if(node.data + currSum == targetSum){
                return(true);
            }
        }
        return hasPathSumHelper(node.left, targetSum, currSum+node.data) || hasPathSumHelper(node.right, targetSum, currSum+node.data);
    }
}
