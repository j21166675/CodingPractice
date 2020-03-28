/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

        Example:

        Input: 38
        Output: 2
        Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
        Since 2 has only one digit, return it.*/

public class AddDigits {

    public static void main(String a[]){
        AddDigits obj = new AddDigits();
        System.out.println(obj.addDigits(38));
        System.out.println(obj.addDigits(100));
        System.out.println(obj.addDigits(99999999));
        System.out.println(obj.addDigits(0000000006));
    }

    public int addDigits(int num) {
        int sum = 0;
        while(num !=0) {
            sum += num % 10;
            num =num/10;
            if(num == 0 && sum >9){
                num = sum;
                sum =0;
            }
        }
        return sum;

    }
}
