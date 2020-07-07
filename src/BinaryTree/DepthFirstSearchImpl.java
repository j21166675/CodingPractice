package BinaryTree;

public class DepthFirstSearchImpl {
    private TreeNode createBST(int[] sortedArr, int start, int end) throws Exception {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(sortedArr[mid]);
        root.left = createBST(sortedArr, start, mid - 1);
        root.right = createBST(sortedArr, mid + 1, end);
        return root;
    }

    private void preOrderTraversalPrinting(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data+", ");
        preOrderTraversalPrinting(root.left);
        preOrderTraversalPrinting(root.right);
    }

    private void inOrderTraversalPrinting(TreeNode root) {
        if (root == null) return;
        preOrderTraversalPrinting(root.left);
        System.out.print(root.data+", ");
        preOrderTraversalPrinting(root.right);
    }

    private void postOrderTraversalPrinting(TreeNode root) {
        if (root == null) return;
        preOrderTraversalPrinting(root.left);
        preOrderTraversalPrinting(root.right);
        System.out.print(root.data+", ");
    }

    public static void main(String a[]) throws Exception {
        TreeNode root = BSTHelper.createBst();
        DepthFirstSearchImpl obj = new DepthFirstSearchImpl();

        System.out.print("Pre-Order : ");
        obj.preOrderTraversalPrinting(root);
        System.out.print('\n');
        System.out.print("In-Order : ");
        obj.inOrderTraversalPrinting(root);
        System.out.print('\n');
        System.out.print("Post-Order : ");
        obj.postOrderTraversalPrinting(root);

    }
}
