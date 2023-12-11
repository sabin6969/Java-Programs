// https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278
import java.util.Arrays;

public class RotateAnArrayByK {
    static void rotateAnArray(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateAnArray(arr);
    }
}
