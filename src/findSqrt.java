public class findSqrt {
    public static void main(String[] a) {
        findSqrt obj = new findSqrt();
        System.out.println(obj.retSqrt(38));
    }

    private int retSqrt(int num) {
        return (int) (Math.floor(Math.sqrt(num)));

    }
}
