package BinaryTree;

import java.util.ArrayList;

public class BSTHelper {
    protected static TreeNode createBst()throws Exception{
        LevelOrderTraversal obj = new LevelOrderTraversal();
        int[] sortedArray = new int[]{5,5,5,5,5,5};
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        return root;
    }

    protected static TreeNode createBstFromSortedArr()throws Exception{
        LevelOrderTraversal obj = new LevelOrderTraversal();
        int[] sortedArray = new int[]{-10, 1, 2, 3, 4, 5, 6};
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        return root;
    }

    protected static TreeNode createBstFromSortedArr(int[] sortedArray)throws Exception{
        LevelOrderTraversal obj = new LevelOrderTraversal();
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        return root;
    }

    protected static TreeNode createPrintBSTLevelOrder()throws Exception{
        LevelOrderTraversal obj = new LevelOrderTraversal();
        int[] sortedArray = new int[]{-10, 1, 2, 3, 4, 5, 6};
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        //printing in levels
        for (ArrayList<Integer> i : obj.bfs(root)) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.print('\n');
        }
        return root;
    }
}
