public class VersionComparison {

    public static void main(String[] s) {
        VersionComparison obj = new VersionComparison();
        System.out.println(obj.compareVersion("1.0", "2.0"));
        System.out.println((Integer.parseInt("001")));
        String s1 = "JOhney";
        for (char ch : s1.toCharArray()) {

        }
    }

    public int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null) return 0;
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int i = 0;
        while (str1.length > i || str2.length > i) {
            if (version1.length() > i && version2.length() > i) {
                if (Integer.parseInt(str1[i]) > Integer.parseInt(str2[i])) return 1;
                else if (Integer.parseInt(str1[i]) < Integer.parseInt(str2[i])) return -1;
            } else if (str1.length > i) {
                if (Integer.parseInt(str1[i]) != 0) return 1;

            } else if (str2.length > i) {
                if (Integer.parseInt(str2[i]) != 0) return -1;

            }
            i++;
        }

        return 0;
    }
}

