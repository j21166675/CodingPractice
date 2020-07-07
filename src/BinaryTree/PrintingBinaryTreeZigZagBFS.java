package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PrintingBinaryTreeZigZagBFS {


    private ArrayList<ArrayList<Integer>> bfsZigzag(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        TreeNode node = null;
        queue.add(root);
        Boolean revFlag = false;
        while (queue.size() != 0) {
            ArrayList<Integer> innerList = new ArrayList<Integer>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {

                node = queue.remove();
                innerList.add(node.data);
                System.out.println(node.data);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            if (revFlag) {
                Collections.reverse(innerList);
                revFlag = false;
            }
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
