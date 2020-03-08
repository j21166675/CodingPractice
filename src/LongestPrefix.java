class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {

        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int k = 0;
            if (k < strs[i].length() && k < res.length() && (strs[i].charAt(k) == res.charAt(k))) {
                k++;
            }
            if (k > 0) {
                res = res.substring(0, k);
            } else return "";
        }
        return res;
    }
}