package BinaryTree;

import Recursive.LetterCaseVariations;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> bfs(TreeNode root) throws Exception {
        //if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode tempTreeNode = null;
        queue.add(root);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        while (!queue.isEmpty()) {
            ArrayList<Integer> innerList = new ArrayList<Integer>();
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                tempTreeNode = queue.remove();
                innerList.add(tempTreeNode.data);
                // System.out.println(" " + tempTreeNode.data);
                if (tempTreeNode.left != null) {
                    queue.add(tempTreeNode.left);
                }
                if (tempTreeNode.right != null) {
                    queue.add(tempTreeNode.right);
                }
            }
            list.add(innerList);
        }
        return list;
    }

    public static void main(String a[]) throws Exception {

        LevelOrderTraversal obj = new LevelOrderTraversal();
        int[] sortedArray = new int[]{-10, 1, 2, 3, 4, 5, 6};
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        LevelOrderTraversal obj2 = new LevelOrderTraversal();
        for (ArrayList<Integer> i : obj2.bfs(root)) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.print('\n');
        }
    }

}
