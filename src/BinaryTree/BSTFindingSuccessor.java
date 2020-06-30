package BinaryTree;

public class BSTFindingSuccessor {
    protected int findSuccessor(TreeNode keyroot, TreeNode root, int k)throws Exception{
        if (keyroot == null) throw new Exception(" ");
        if(keyroot.right !=null){
            keyroot = keyroot.right;
            if(keyroot.left == null){
                return keyroot.data;
            }
            while(keyroot.left !=null){
                keyroot = keyroot.left;
            }
        }
        if(keyroot.right == null){
            if(getAncestor(root, keyroot) ==null){
                throw new Exception(" This is the biggest element in the tree. Cant find the successor");
            }
        }
        return root.data;
    }

    protected TreeNode searchBST(TreeNode root, int k)throws Exception{
        if(root == null) return null;
        if (root.data == k) return root;
        if(root.data > k && root.left !=null){
           return searchBST(root.left,k);
        }
        if(root.data < k && root.right !=null){
          return  searchBST(root.right,k);
        }
        return null;
    }

    protected TreeNode getAncestor(TreeNode root, TreeNode keyRoot)throws Exception{
        TreeNode ancestor = null;
        TreeNode curr = root;
        while(curr != keyRoot){
            if(curr.data > keyRoot.data){
                ancestor = curr;
                curr = curr.left;

            }
            else{
                curr = curr.right;
            }
        }
        return ancestor;
    }

    public static void main(String a[])throws Exception{
        TreeNode root = BSTHelper.createPrintBSTLevelOrder();

        BSTFindingSuccessor obj = new BSTFindingSuccessor();
        int k = 6;
        System.out.println(obj.findSuccessor(obj.searchBST(root,k), root, k));
    }
}
