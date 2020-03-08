public class RotateMatrix {

    public static void main(String[] a) {
        RotateMatrix obj = new RotateMatrix();
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        obj.rotate(mat);
        String[] str = {"ban", "john"};

    }

    public void rotate(int[][] matrix) {
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            // System.out.println();
            for (int j = matrix.length - 1; j >= 0; j--) {

                System.out.println(matrix[j][i]);

            }
        }
    }
}

