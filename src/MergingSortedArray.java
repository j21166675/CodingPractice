public class MergingSortedArray {
    public static void main(String[] a) {
        int[] arr1 = {1, 3, 5, 8, 11, 12, 13, 14, 14, 15, 16, 17, 18, 19};
        int[] arr2 = {2, 4, 6, 7, 9, 10};
        MergingSortedArray obj = new MergingSortedArray();
        System.out.println("Results : ");
        int[] res = obj.mergedArr(arr1, arr2);
        for (int resSet : res) {
            System.out.println(resSet);
        }
    }

    private int[] mergedArr(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newarr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newarr[k++] = arr1[i++];
            } else {
                newarr[k++] = arr2[j++];
            }
        }
        if (i < arr1.length) {
            for (int temp = i; temp < arr1.length; temp++) {
                newarr[k++] = arr1[temp];
            }
        } else if (j < arr2.length) {

            for (int temp = j; temp < arr2.length; temp++) {

                newarr[k++] = arr2[temp];
            }
        }
        return newarr;
    }
}
