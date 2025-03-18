package PermutationCombination;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BinaryPrinting {
    ArrayList<ArrayList<String>> list = new ArrayList<>();
    ArrayList<String> subset = new ArrayList<>();

    public BinaryPrinting() {
    }

    public void printBinary(String slate, int n) {
       // System.out.println("n "+n);
      //  System.out.println("slate "+ slate);

        if (n == 0) {
            System.out.println( slate);
        } else {
            printBinary(slate + "0", n - 1);
            printBinary(slate + "1", n - 1);
        }

    }

    public void printAlphaPractice(String slate, String str){
        if(str.length() == slate.length()){
            System.out.println(slate);
        }
        else{
            for(int i=0; i<str.length();i++){
                printAlphaPractice(slate + str.charAt(i), str);
            }

        }
    }

    public void printDecimal(String slate, int n) {
        if (n == 0) {
            System.out.println(slate);
        } else {
            for(int i = 0; i <= n; ++i) {
                printDecimal(slate + String.valueOf(i), n - 1);
            }
        }

    }

    public void printAlpha(String slate, String str) {
        if (slate.length() >= str.length()) {
            System.out.println(slate);
        } else {
            for(int i = 0; i < str.length(); ++i) {
                printAlpha(slate + str.charAt(i), str);
            }
        }

    }

    public void printNonRepeatedChar(String slate, String str) {
        if (str.isEmpty()) {
            System.out.println(slate);
        } else {
            for(int i = 0; i < str.length(); ++i) {
                printNonRepeatedChar(slate + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }
        }

    }

    public void printCaseVariation(String slate, String str) {
        if (slate.length() == 4) {
            System.out.println(slate);
        } else {
            for(int i = 0; i < str.length(); ++i) {
                if (Character.isLetter(str.charAt(i))) {
                    printCaseVariation(slate + String.valueOf(str.charAt(i)).toLowerCase(), str.substring(i + 1));
                    printCaseVariation(slate + String.valueOf(str.charAt(i)).toUpperCase(), str.substring(i + 1));
                } else {
                    printCaseVariation(slate + str.charAt(i), str.substring(i + 1));
                }
            }
        }

    }

    public void printCaseVariation2(String slate, String str) {
        if (slate.length() == str.length()) {
            System.out.println(slate);
        } else {
            int i = slate.length();
            if (Character.isLetter(str.charAt(i))) {
                printCaseVariation2(slate + String.valueOf(str.charAt(i)).toLowerCase(), str);
                printCaseVariation2(slate + String.valueOf(str.charAt(i)).toUpperCase(), str);
            } else {
                printCaseVariation2(slate + str.charAt(i), str);
            }
        }

    }

    public ArrayList<ArrayList<String>> printSubSet(int i, String str, int k, int count) {
       /* if (i >= str.length()) {
            list.add(subset);
            System.out.println(subset.toString());
        /*for(String s : subset) {
                count += Integer.parseInt(s);
            }

            if (count == k) {
                list.add((ArrayList)subset);
                System.out.println(subset.toString());
            } else */
if(i == str.length()) {
    list.add(subset);
    System.out.println(subset);
}
else {
    subset.add(String.valueOf(str.charAt(i)));
    printSubSet(i + 1, str, k, count);
    subset.remove(subset.size() - 1);
    printSubSet(i + 1, str, k, count);

}
        return list;
    }

    public static void main(String[] a) {
        BinaryPrinting obj = new BinaryPrinting();
        System.out.println("--------------\n");
        List<ArrayList<String>> list = obj.printSubSet(0,"123",3, 0);
        System.out.println( " List count "+list.size());
        for(ArrayList<String> l : list){
            for(String s : l){
                System.out.print(s);
            }
        }
        System.out.println("\n");
       // obj.printAlphaPractice("", "abc");
    }
}
