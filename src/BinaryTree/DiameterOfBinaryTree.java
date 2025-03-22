package BinaryTree;

public class DiameterOfBinaryTree {
    public static int diameter = 0;
    public int findDiameter(TreeNode root){
        diameter = 0;
        findDiameterHelper(root);
        return diameter;
    }

   private int findDiameterHelper(TreeNode node){
        int tempdiameter = 0;
        int left = 0;
        int right = 0;

        if(node.left == null && node.right == null){
            return 0;
        }
        if(node.left != null){
            left = findDiameterHelper(node.left);
            tempdiameter += left+1;
        }
        if(node.right != null){
             right = findDiameterHelper(node.right);
            tempdiameter += right+1;
        }
        diameter = Math.max(diameter, tempdiameter);
        return Math.max(left, right)+1;
    }

    public static void main(String[] args)throws Exception{
        TreeNode root = BSTHelper.createBst();

        DiameterOfBinaryTree obj = new DiameterOfBinaryTree();
        System.out.println(obj.findDiameter(root));
    }
}
