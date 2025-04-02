package BinaryTree;

import java.sql.Array;
import java.util.ArrayList;

public class PrintingAllPath {
    ArrayList<ArrayList<Integer>> resList = new ArrayList<>();
    ArrayList<ArrayList<Integer>> all_paths_of_a_binary_tree(TreeNode root) {
        // Write your code here.
       // resList = null;
        ArrayList<Integer> slate = new ArrayList<Integer>();
        helper(root,slate);
        return resList;
    }

    void helper(TreeNode node, ArrayList<Integer> slate){
        if(node == null){
            return;
        }
        slate.add(node.data);
        if(node.left == null && node.right == null){
           // System.out.println("-------------");
            for(Integer i : slate) {
              //  System.out.print(i + ", ");
            }
            resList.add(new ArrayList<>(slate));
        }
        else{

            if(node.left != null){
                helper(node.left, slate);
            }
            if(node.right != null){
                helper(node.right, slate);
            }
        }
        slate.remove(slate.size()-1);
    }

    public static void main(String[] args)throws Exception {
        PrintingAllPath obj = new PrintingAllPath();
        TreeNode root = BSTHelper.createBst();
        for(ArrayList<Integer> slate : obj.all_paths_of_a_binary_tree(root)){
            for(Integer i : slate){
                System.out.print(i + ", ");
            }
            System.out.println(" ");
        }
    }

}
