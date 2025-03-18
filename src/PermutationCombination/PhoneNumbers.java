package PermutationCombination;
import java.util.Map;

import java.util.HashMap;

public class PhoneNumbers {
    Map<Character, String> map = new HashMap<Character, String>();

    PhoneNumbers() {
        map.put('2', "ABC");
        map.put('3', "DEF");
        map.put('4', "GHI");
        map.put('5', "JKL");
        map.put('6', "MNO");
        map.put('7', "PQRS");
        map.put('8', "TUV");
        map.put('9', "WXYZ");
    }

    public void printPhoneNumbers(int i, String slate, String str){
        if(str.length() == slate.length()){
            System.out.println(slate);
        }
        else if(i < str.length()) {
            for (char ch : map.get(str.charAt(i)).toCharArray()) {
                printPhoneNumbers(i + 1, slate + ch, str);
            }
        }
    }
    public static void main(String a[]){
        PhoneNumbers obj = new PhoneNumbers();
        obj.printPhoneNumbers(0,"", "23");
    }
}
