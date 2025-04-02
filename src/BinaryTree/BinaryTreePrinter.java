package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePrinter {

    public static void printArrayAsBinaryTree(int[] arr) {
        TreeNode root = constructBinaryTree(arr);
        printBinaryTree(root);
    }

    public static TreeNode constructBinaryTree(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) { // Assuming -1 represents null
                nodes[i] = new TreeNode(arr[i]);
            } else {
                nodes[i] = null;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (nodes[i] != null) {
                int leftChildIndex = 2 * i + 1;
                int rightChildIndex = 2 * i + 2;

                if (leftChildIndex < arr.length) {
                    nodes[i].left = nodes[leftChildIndex];
                }
                if (rightChildIndex < arr.length) {
                    nodes[i].right = nodes[rightChildIndex];
                }
            }
        }
        return nodes[0];
    }

    public static void printBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }

        int height = getHeight(root);
        int width = (int) Math.pow(2, height + 1) - 1;
        List<String>[] treeStr = new ArrayList[height + 1];

        for (int i = 0; i <= height; i++) {
            treeStr[i] = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                treeStr[i].add(" ");
            }
        }

        fillTreeString(root, 0, 0, width, treeStr);

        for (List<String> row : treeStr) {
            for (String s : row) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    private static void fillTreeString(TreeNode node, int row, int left, int right, List<String>[] treeStr) {
        if (node == null) {
            return;
        }

        int mid = (left + right) / 2;
        treeStr[row].set(mid, String.valueOf(node.data));

        fillTreeString(node.left, row + 1, left, mid - 1, treeStr);
        fillTreeString(node.right, row + 1, mid + 1, right, treeStr);
    }

    private static int getHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printArrayAsBinaryTree(arr);

        int[] arr2 = {1,2,3,-1,4,-1,-1,5};
        printArrayAsBinaryTree(arr2);
    }
}
