package BinaryTree;

public class FindingMaxBST {
    protected int findMax(TreeNode root) throws Exception {
        if (root == null) throw new Exception(" Not valid BST ");

        if (root.right != null) {
          return findMax(root.right);
        }
        return root.data;
    }

    public static void main(String a[]) throws Exception {
        TreeNode root = BSTHelper.bstCreator();
        FindingMaxBST obj = new FindingMaxBST();
        System.out.println(obj.findMax(root));
    }
}
