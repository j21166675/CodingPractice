package BinaryTree;

import java.util.ArrayList;

public class PathSumII {
    ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> getPathSumList(TreeNode root, int target){

        ArrayList<Integer> subList = new ArrayList<>();

        return pathSumListHelper(root, target, 0,  subList);
    }

    private ArrayList<ArrayList<Integer>> pathSumListHelper(TreeNode node, int target, int currSum, ArrayList<Integer> subList) {
        if(node == null) return pathList;
        subList.add(node.data);
        currSum += node.data;
        if(node.left == null && node.right == null){
            if(currSum == target){
                for(int i:subList){
                    //System.out.println(i+" ll");
                }
                pathList.add((ArrayList<Integer>) subList.clone());
            }
        }
        else {
            pathSumListHelper(node.left, target, currSum,  subList);
            pathSumListHelper(node.right, target, currSum,  subList);
        }
        subList.remove(subList.size()-1);
        return pathList;
    }

public static void main(String[] args)throws Exception {
        TreeNode root = BSTHelper.createBst();
        PathSumII obj = new PathSumII();
    PrintingBinaryTreeZigZagBFS obj2 = new PrintingBinaryTreeZigZagBFS();
    for (ArrayList<Integer> i : obj2.bfsZigzag(root)) {
        for (int j : i) {
            System.out.print(" " + j);
        }
        System.out.print('\n');
    }
        for(ArrayList<Integer> i:obj.getPathSumList(root, -6)){
            System.out.println(i);
    }
}
}
