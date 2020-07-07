package BinaryTree;

import com.sun.source.tree.Tree;

class CreatingBinaryTree {
    public TreeNode createBT(int[] sortedArr, int start, int end) throws Exception {
       if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(sortedArr[mid]);
        root.left = createBT(sortedArr, start, mid - 1);
        root.right = createBT(sortedArr, mid + 1, end);
        return root;
    }

    public void preOrderTraversal(TreeNode root) throws Exception {
        if (root == null) return;
        System.out.println(" " + root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String a[]) throws Exception {
        int[] sortedArr = new int[]{1,2,3,4,5,6,7};
        CreatingBinaryTree obj = new CreatingBinaryTree();
        TreeNode root = obj.createBT(sortedArr, 0, sortedArr.length - 1);
        obj.preOrderTraversal(root);
    }
}