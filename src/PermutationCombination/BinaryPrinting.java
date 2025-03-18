package PermutationCombination;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrinting {
    List<ArrayList> list = new ArrayList();
    List<String> subset = new ArrayList();

    public BinaryPrinting() {
    }

    public void printBinary(String slate, int n) {
        if (n == 0) {
            System.out.println(slate);
        } else {
            this.printBinary(slate + "0", n - 1);
            this.printBinary(slate + "1", n - 1);
        }

    }

    public void printDecimal(String slate, int n) {
        if (n == 0) {
            System.out.println(slate);
        } else {
            for(int i = 0; i <= n; ++i) {
                this.printDecimal(slate + String.valueOf(i), n - 1);
            }
        }

    }

    public void printAlpha(String slate, String str) {
        if (slate.length() >= str.length()) {
            System.out.println(slate);
        } else {
            for(int i = 0; i < str.length(); ++i) {
                this.printAlpha(slate + str.charAt(i), str);
            }
        }

    }

    public void printNonRepeatedChar(String slate, String str) {
        if (str.isEmpty()) {
            System.out.println(slate);
        } else {
            for(int i = 0; i < str.length(); ++i) {
                String var10001 = slate + str.charAt(i);
                String var10002 = str.substring(0, i);
                this.printNonRepeatedChar(var10001, var10002 + str.substring(i + 1));
            }
        }

    }

    public void printCaseVariation(String slate, String str) {
        if (slate.length() == 4) {
            System.out.println(slate);
        } else {
            for(int i = 0; i < str.length(); ++i) {
                if (Character.isLetter(str.charAt(i))) {
                    this.printCaseVariation(slate + String.valueOf(str.charAt(i)).toLowerCase(), str.substring(i + 1));
                    this.printCaseVariation(slate + String.valueOf(str.charAt(i)).toUpperCase(), str.substring(i + 1));
                } else {
                    this.printCaseVariation(slate + str.charAt(i), str.substring(i + 1));
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
                this.printCaseVariation2(slate + String.valueOf(str.charAt(i)).toLowerCase(), str);
                this.printCaseVariation2(slate + String.valueOf(str.charAt(i)).toUpperCase(), str);
            } else {
                this.printCaseVariation2(slate + str.charAt(i), str);
            }
        }

    }

    public void printSubSet(int i, String str, int k, int count) {
        if (i >= str.length()) {
            for(String s : this.subset) {
                count += Integer.parseInt(s);
            }

            if (count == k) {
                this.list.add((ArrayList)this.subset);
                System.out.println(this.subset.toString());
            }
        } else {
            this.subset.add(String.valueOf(str.charAt(i)));
            this.printSubSet(i + 1, str, k, count);
            this.subset.remove(this.subset.size() - 1);
            this.printSubSet(i + 1, str, k, count);
        }

    }

    public static void main(String[] a) {
        BinaryPrinting obj = new BinaryPrinting();
        System.out.println("--------------\n");
        obj.printSubSet(0, "1234", 6, 0);
    }
}
