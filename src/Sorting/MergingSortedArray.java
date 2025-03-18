package Sorting;

import java.util.ArrayList;

public class MergingSortedArray {

    static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Write your code here.
        int firstList = first.size() - 1;
        int secondList = firstList;
        int k = second.size() - 1;

        while(firstList >= 0 && secondList >= 0){
            if(first.get(firstList) >= second.get(secondList)){
                second.set(k, first.get(firstList));
                k--;
                firstList--;
            }
            else if(first.get(firstList) <= second.get(secondList)){
                second.set(k, second.get(secondList));
                k--;
                secondList--;
            }
        }
        while (firstList >= 0) {
            second.set(k, first.get(firstList));
            firstList--;
            k--;
        }

        return second;
    }

    public static void main(String a[]){
        MergingSortedArray obj = new MergingSortedArray();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(3);
        first.add(5);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(2);
        second.add(4);
        second.add(6);
        second.add(0);
        second.add(0);
        second.add(0);


        ArrayList<Integer> list = obj.merge_one_into_another(first, second);
        for(int i:list){
            System.out.println(i);
        }

    }

}
