package BinaryTree;

public class Merge2BST {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }
        else if(t1 == null){
            return t2;
        }
        else{
            return t1;
        }

       // helper(t1, t2);
    }
    public void helper(TreeNode t1, TreeNode t2){
        while(t1 != null){
            if(t1.data < t2.data){
                t1 = t1.left;
            }
        }
    }
}
