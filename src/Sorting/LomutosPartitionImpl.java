package Sorting;

public class LomutosPartitionImpl {

    private int[] partition(int[] arr) {
        int pivot = arr[arr.length - 1];
        int j = -1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < pivot) {
                j++;
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        arr[arr.length - 1] = arr[j + 1];
        arr[j + 1] = pivot;
        return arr;
    }

    public static void main(String a[]) throws Exception {
        LomutosPartitionImpl obj = new LomutosPartitionImpl();
        for (int i : obj.partition(new int[]{11, 3, 10, 2, 8})) {
            System.out.println(i);
        }
    }
}
