class NeedleString {
    public static void main(String[] a) {
        NeedleString obj = new NeedleString();

        System.out.println(obj.strStr("mississippi", "issip"));
    }

    public int strStr(String haystack, String needle) {
        int count = 0;
        if (haystack == null) {
            return -1;
        } else if (haystack.indexOf(needle) == -1) {
            return -1;
        } else if (haystack.indexOf(needle) == haystack.lastIndexOf(needle)) {
            return needle.length();
        } else {
            count = removeNeedle(haystack, needle, count);

        }
        return count;
    }

    private int removeNeedle(String haystack, String needle, int i) {
        System.out.println("Hay STck : " + haystack);

        while (haystack.indexOf(needle) > 0) {
            if (haystack.indexOf(needle) == 0) {
                return removeNeedle(haystack.substring(needle.length() - 1, haystack.length() - 1), needle, ++i);

            } else {
                // System.out.println("Hey : " + haystack.substring(0, haystack.indexOf(needle)) + haystack.substring(((haystack.indexOf(needle)) + needle.length())));
                return removeNeedle(haystack.substring(0, haystack.indexOf(needle)) + haystack.substring(((haystack.indexOf(needle)) + needle.length())), needle, i + needle.length());

            }

        }
        return i;

    }
}