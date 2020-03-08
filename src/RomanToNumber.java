public class RomanToNumber {
    public static void main(String[] a) {
        RomanToNumber obj = new RomanToNumber();
        System.out.println(obj.romanToInt("III"));
    }

    public int romanToInt(String s) {
        int currentVal = 0;
        int PrevVal = 0;
        int sum = 0;
        if (s.length() == 1)
            return sum = getIntValue(s.charAt(0));
        for (int i = s.length() - 1; i > 0; i--) {
            System.out.println(" getIntValue(s.charAt(i)) " + getIntValue(s.charAt(i)));
            System.out.println(" getIntValue(s.charAt(i+1)) " + getIntValue(s.charAt(i - 1)));

            if (getIntValue(s.charAt(i)) > getIntValue(s.charAt(i - 1))) {
                sum += getIntValue(s.charAt(i));

            } else
                sum += getIntValue(s.charAt(i));
        }
        return sum;
    }

    private int getIntValue(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }
}

