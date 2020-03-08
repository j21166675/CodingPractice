public class Solution {

    String[] belowTen = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] belowTwenty = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] belowHundred = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    public static void main(String[] a) {
        Solution obj = new Solution();
        System.out.println(obj.getWords(1030));
    }

    private String getWords(int num) {
        if (num == 0) return " ";
        if (num > 0 && num < 10) return belowTen[num];
        else return getWordsTemp(num);


    }

    private String getWordsTemp(int num) {
        StringBuilder sb = new StringBuilder();

        if (num < 20) {
            sb.append(belowTwenty[num % 10]);
        } else if (num < 100) {
            sb.append(belowHundred[num / 10]).append(" ").append(getWords(num % 10));
        } else if (num < 1000) {
            sb.append(belowTen[num / 100]).append(" Hundred ").append(getWords(num % 100));
        } else if (num < 1000000) {
            sb.append(getWords(num / 1000)).append(" Thousand ").append(getWords(num % 1000));
        }
        return String.valueOf(sb);
    }
}
