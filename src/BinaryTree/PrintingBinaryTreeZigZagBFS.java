package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PrintingBinaryTreeZigZagBFS {


    private ArrayList<ArrayList<Integer>> bfsZigzag(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        TreeNode tempTreeNode = null;
        queue.add(root);
        boolean revFlag = false;
        int count = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> innerList = new ArrayList<Integer>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                tempTreeNode = queue.remove();
                innerList.add(tempTreeNode.data);
               // System.out.println(tempTreeNode.data);
                if (tempTreeNode.left != null) {
                    queue.add(tempTreeNode.left);
                }
                if (tempTreeNode.right != null) {
                    queue.add(tempTreeNode.right);
                }
            }
            if (count % 2 == 0) {
                Collections.reverse(innerList);

            }
            count++;
            list.add(innerList);
        }
        return list;
    }

    public static void main(String a[]) throws Exception {
        TreeNode root = BSTHelper.createBst();
        PrintingBinaryTreeZigZagBFS obj2 = new PrintingBinaryTreeZigZagBFS();
        for (ArrayList<Integer> i : obj2.bfsZigzag(root)) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.print('\n');
        }
    }

}
