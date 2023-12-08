import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        // inorder to perform matrix addition their order must be same
        // 2*3 matrix
        int[][] matrixOne = {
                { 12, 33, 11 },
                { 13, 11, 45 },
        };
        // 2*3 matrix
        int[][] matrixTwo = {
                { 11, 99, 44 },
                { 18, 16, 42 },
        };
        int[][] newMatrix = new int[2][3];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                newMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        for (int[] i : newMatrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
