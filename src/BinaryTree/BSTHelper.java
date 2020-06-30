package BinaryTree;

public class BSTHelper {
    protected static TreeNode bstCreator()throws Exception{
        LevelOrderTraversal obj = new LevelOrderTraversal();
        int[] sortedArray = new int[]{-10, 1, 2, 3, 4, 5, 6};
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        return root;
    }

    protected static TreeNode bstCreatorFromSortedArr()throws Exception{
        LevelOrderTraversal obj = new LevelOrderTraversal();
        int[] sortedArray = new int[]{-10, 1, 2, 3, 4, 5, 6};
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        return root;
    }

    protected static TreeNode bstCreatorFromSortedArr(int[] sortedArray)throws Exception{
        LevelOrderTraversal obj = new LevelOrderTraversal();
        CreatingBinaryTree cbtObj = new CreatingBinaryTree();
        TreeNode root = cbtObj.createBT(sortedArray, 0, sortedArray.length - 1);
        return root;
    }
}
