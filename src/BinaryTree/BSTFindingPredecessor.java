package BinaryTree;

import com.sun.source.tree.Tree;

public class BSTFindingPredecessor {
    int ANCESTOR = 0;

    protected int findPredecessor(TreeNode keyRoot, TreeNode root, int k)throws Exception{
        if (keyRoot.left != null) {
            keyRoot = keyRoot.left;
            if(keyRoot.right ==null) return keyRoot.data;
            else{
                while(keyRoot.right != null){
                    keyRoot = keyRoot.right;
                }
            }
        }
        if(keyRoot.left ==null){

            if(getAncestor(root, keyRoot) ==null){
                throw new Exception(" This is the lowest element in the tree. Cant find the predecessor");
            }
        }
        return root.data;
    }

    private TreeNode getAncestor(TreeNode root, TreeNode keyRoot)throws Exception{
        TreeNode ancestor = null;
        TreeNode curr = root;
        while(curr != keyRoot){
            if(curr.data < keyRoot.data){
                ancestor = curr;
                curr = curr.right;

            }
            else{
                curr = curr.left;
            }
        }
        return ancestor;
    }

    protected TreeNode searchBST(TreeNode root, int k)throws Exception{
        if(root.data == k) return root;
        if(root.data > k){
           return searchBST(root.left, k);
        }
        if(root.data < k){
           return searchBST(root.right, k);
        }
        return null;
    }

    public static void main(String a[])throws Exception{
       TreeNode root = BSTHelper.createPrintBSTLevelOrder();
        BSTFindingPredecessor obj = new BSTFindingPredecessor();
        int k = 4;
        System.out.println(obj.findPredecessor(obj.searchBST(root,k), root, k));

    }
}
