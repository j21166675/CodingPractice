package BinaryTree;

public class FindingMinBST {

    private int findMin(TreeNode root) throws Exception {
        if (root == null) {
            throw new Exception(" ");
        }
        if (root.left != null) {
            return findMin(root.left);
        }
        return root.data;
    }

    public static void main(String a[]) throws Exception {
        TreeNode root = BSTHelper.createBst();
        FindingMinBST obj = new FindingMinBST();
        System.out.println(obj.findMin(root));
    }
}
