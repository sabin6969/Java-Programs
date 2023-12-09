// https://www.codingninjas.com/studio/problems/reverse-the-array_1262298

import java.util.Arrays;

public class SwapArrayAfterCertainIndex {
    static int[] swapArray(int[] array, int index) {
        int start = index + 1;
        int end = array.length - 1;
        while (!(start >= end)) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, };
        int[] ans = swapArray(nums, 5);
        System.out.println(Arrays.toString(ans));
    }
}
