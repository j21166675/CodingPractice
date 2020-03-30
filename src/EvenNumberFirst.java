public class EvenNumberFirst {
    private static int[] rearrange(int[] arr){
        int i =0;
        int j =arr.length-1;
        while(i<j){
            if(arr[i] % 2 == 0){
                i++;
            }
           else if(arr[j] % 2 ==0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }

        return arr;
    }

    public static void main(String a[]){
        int[] rearrange = rearrange(new int[]{1, 4, 5, 6, 7, 8,9,10});
        for(int i:rearrange){
            System.out.println(i);
        }
    }
}
