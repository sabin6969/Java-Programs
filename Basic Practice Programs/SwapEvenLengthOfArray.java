import java.util.Arrays;

public class SwapEvenLengthOfArray {
    static int[] swapEvenLengthOfArray(int[] array) {
        int iteration = array.length / 2;
        int j = 1;
        int k = 0;
        for (int i = 0; i < iteration; i++) {
            int temp = array[k];
            array[k] = array[j];
            array[j] = temp;
            j += 2;
            k += 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int[] reversedArray = swapEvenLengthOfArray(array);
        System.out.println(Arrays.toString(reversedArray));
    }
}
