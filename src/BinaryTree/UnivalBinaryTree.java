package BinaryTree;

public class UnivalBinaryTree {
    int univalCount;
    public int findUnivalTree(TreeNode root){
        univalCount = 0;
        findUnivalTreeHelper(root);
        return univalCount;
    }

    private boolean findUnivalTreeHelper(TreeNode root){
        boolean found = true;

      if(root.left == null && root.right == null){
          univalCount += 1;
          return true;
      }
      if(root.left != null){
         boolean left = findUnivalTreeHelper(root.left);
         if(!left || (root.data != root.left.data)){
             found = false;
         }
      }
      if(root.right != null){
          boolean right = findUnivalTreeHelper(root.right);
          if(!right || (root.data != root.right.data)){
              found = false;
          }
      }
      if(found){
          univalCount += 1;
      }
      return found;
    }

    public static void main(String[] args)throws Exception {
        TreeNode root = BSTHelper.createBst();
        UnivalBinaryTree obj = new UnivalBinaryTree();
        System.out.println(obj.findUnivalTree(root));
    }
}
