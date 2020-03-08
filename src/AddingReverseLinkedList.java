import java.util.ArrayList;

public class AddingReverseLinkedList {
    public static void main(String[] a) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(2);
        list2.add(2);

        AddingReverseLinkedList obj = new AddingReverseLinkedList();
        System.out.println("Result : " + obj.retList(list1, list2).toString());


    }

    private ArrayList<Integer> retList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int list1Sum = 0;
        int list2Sum = 0;
        for (int i = list1.size() - 1; i >= 0; i--) {
            list1Sum += list1.get(i);

        }
        for (int i = list2.size() - 1; i >= 0; i--) {
            list2Sum += list2.get(i);

        }
        System.out.println(("List 1 Sum : " + list1Sum));
        System.out.println(("List 2 Sum : " + list2Sum));
        int sum = list1Sum + list2Sum;
        System.out.println(("Sum  : " + sum));
        ArrayList<Integer> totalSum = new ArrayList<Integer>();
        while (sum != 0) {
            int temp = sum % 10;
            System.out.println(" Temp " + temp);
            System.out.println(" Sum " + sum);
            totalSum.add(temp);
            sum = sum / 10;
            System.out.println(" Temp 2 " + temp);

        }
        return totalSum;
    }
}


