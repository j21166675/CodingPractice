package PermutationCombination;

import java.util.ArrayList;
import java.util.List;

public class SubstringPalindrome {
    ArrayList<String> currentSubset = new ArrayList<>();

    public void substring(String str, int i, ArrayList<String> slate) {
        if (i == str.length()) {
            System.out.println(slate.toString());
        }
        for (int j = i; j < str.length(); ++j) {
            if (isPalindrome(str, i, j)) {
                slate.add(str.substring(i, j+1));
                substring(str, j + 1, slate);
                slate.remove(slate.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str, int i, int j) {

        while(i<j) {
             // System.out.println("i: " + str.charAt(i) + " j: " + str.charAt(j));
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
        }
    public List<String> findAllSubsets(String str) {
        List<String> subsets = new ArrayList<>();
        generateSubsets(str, 0);
        return subsets;
    }

    private void generateSubsets(String str, int index){
        if (index == str.length()) {
            System.out.println(currentSubset.toString());
            return;
        }

        // Include the current character
        currentSubset.add(String.valueOf(str.charAt(index)));
        generateSubsets(str, index + 1);

        // Exclude the current character
        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(str, index + 1);
    }

    public static void main(String str[]){
        SubstringPalindrome obj = new SubstringPalindrome();
        obj.substring("121", 0, new ArrayList<String>());
        String input = "12";
        List<String> subsets = obj.findAllSubsets(input);
       // System.out.println(subsets);
    }
}


