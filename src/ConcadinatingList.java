import java.util.ArrayList;

public class ConcadinatingList {

    public static void main(String[] a) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(0);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(0);

        ConcadinatingList obj = new ConcadinatingList();
        System.out.println(" Result : " + obj.retList(list1, list2).toString());

    }

    private ArrayList<Integer> retList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int list1Digit = 0;
        for (int i = list1.size() - 1; i >= 0; i--) {

            list1Digit += ((list1.get(i) + 10) % 10);
            list1Digit *= 10;
            System.out.println("List Digit 1  " + list1Digit);
        }
        list1Digit = list1Digit / 10;

        System.out.println(" List Digit1 " + list1Digit);

        int list2Digit = 0;
        for (int i = list2.size() - 1; i >= 0; i--) {

            list2Digit += ((list2.get(i) + 10) % 10);
            list2Digit *= 10;
            System.out.println("List Digit 1  " + list2Digit);
        }
        list2Digit = list2Digit / 10;

        int sum = list1Digit + list2Digit;
        ArrayList<Integer> retList = new ArrayList<Integer>();
        while (sum != 0) {
            int temp = sum % 10;
            retList.add(temp);
            sum /= 10;

        }

        System.out.println(" List Digit2 " + list2Digit);
        return retList;
    }
}
