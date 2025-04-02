package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class UpsideDown {
    TreeNode resTree = null;
    public TreeNode upsideDown(TreeNode root) {
        helper(root, null, null);
        return resTree;
    }
    private void helper(TreeNode node, TreeNode parentNode, TreeNode rightNode){

        if(node == null){
            return;
        }
            TreeNode oldLeft = node.left;
            TreeNode oldright = node.right;
            node.left = rightNode;
            node.right = parentNode;
        if(oldLeft == null && oldright == null){

            resTree = node;
        }

        if(oldLeft != null){
            helper(oldLeft, node, oldright);
        }

    }

    public static void main(String a[])throws Exception{
        UpsideDown obj = new UpsideDown();
        TreeNode root = BSTHelper.createBst();
        BinaryTreePrinter.printBinaryTree(root);
        System.out.println("---------");
        TreeNode node = obj.upsideDown(root);
        BinaryTreePrinter.printBinaryTree(node);


    }
}
