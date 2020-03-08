public class FindMedian {
    public static void main(String[] a) {
        FindMedian obj = new FindMedian();
        int[] res = obj.merge2Arrays(new int[]{1, 2}, new int[]{3, 4});
        for (int i : res) {
            System.out.println(i);
        }
        System.out.println(obj.findMedian(res));
    }

    private int[] merge2Arrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newarr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newarr[k] = arr1[i];
                k++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                newarr[k] = arr2[j];
                j++;
                k++;
            } else {
                newarr[k++] = arr2[j++];
                newarr[k++] = arr1[i++];
            }
        }
        System.out.println(" i : " + i + " j " + j);
        if (i < arr1.length) {
            while (i < arr1.length) {

                newarr[k++] = arr1[i++];
            }
        } else if (j < arr2.length) {
            while (j < arr2.length) {
                newarr[k++] = arr2[j++];
            }
        }
        return newarr;
    }

    private float findMedian(int[] arr1) {
        if (arr1.length == 0) return 0;
        if (arr1.length == 1) return arr1[0];
        if (arr1.length % 2 != 0) return (float) arr1[arr1.length / 2];
        else {
            System.out.println(" inside else : " + arr1[(arr1.length / 2) - 1]);
            System.out.println(arr1[arr1.length / 2]);
            int a = arr1[arr1.length / 2 - 1];
            int b = arr1[arr1.length / 2];
            float sum = a + b;
            System.out.println(" REs Float :" + sum + " - " + (float) ((a + b) / 2));
            return sum / 2;
        }

    }
}
