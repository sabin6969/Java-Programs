public class SparseMatrix {
    static boolean isSparseMatrix(int[][] matrix) {
        int countOfZero = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    countOfZero++;
                }
            }
        }
        return countOfZero > ((i * j) / 2);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 0 },
                { 0, 2, 0 },
                { 1, 0, 0 },
        };
        boolean result = isSparseMatrix(matrix);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
