import java.util.Arrays;

public class ReverseAnArray {

    static void reverseArray(int[] number) {
        int start = 0;
        int end = number.length - 1;
        while (!(start > end || start == end)) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 23, 11, 33, 44, 66 };
        System.out.println(Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
