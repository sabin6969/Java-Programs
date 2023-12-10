// https://www.codingninjas.com/studio/problems/copy-and-reverse-the-array_1058196

import java.util.Arrays;

public class CopyAndReverseArray {
    static void copyAndReverseArray(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            copyArray[(array.length - 1) - i] = array[i];
        }
        System.out.println(Arrays.toString(copyArray));
    }

    public static void main(String[] args) {
        int[] array = { 21, 12, 33, 41, 24 };
        copyAndReverseArray(array);
    }
}
