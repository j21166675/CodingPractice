
/*Given an array A of positive integers, let S be the sum of the digits of the minimal element of A.

        Return 0 if S is odd, otherwise return 1.



        Example 1:

        Input: [34,23,1,24,75,33,54,8]
        Output: 0
        Explanation:
        The minimal element is 1, and the sum of those digits is S = 1 which is odd, so the answer is 0.*/
public class SumOfMinNumber {
        public int sumOfDigits(int[] a) {
            int min = a[0];
            for(int i = 1; i<a.length;i++){
                if(a[i] < min){
                    a[i] = min+a[i];
                    min = a[i]-min;
                    a[i] = a[i]-min;
                }

            }
            int sum =0;
            while(min != 0){
                sum += min%10;
                min = min/10;
            }
            if(sum % 2 ==0) return 1;
            else return 0;
        }

    public static void main(String a[]){
        SumOfMinNumber obj = new SumOfMinNumber();
        System.out.println("Answer : " + obj.sumOfDigits(new int[]{34,56,44,32}));
        System.out.println("Answer : " + obj.sumOfDigits(new int[]{4,56,100,5}));
        System.out.println("Answer : " + obj.sumOfDigits(new int[]{1,1,1,1}));
        System.out.println("Answer : " + obj.sumOfDigits(new int[]{0,0,0,0}));
    }

}
