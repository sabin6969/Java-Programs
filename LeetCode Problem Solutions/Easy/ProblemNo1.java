
// https://leetcode.com/problems/two-sum
// O(n^2)
import java.util.Arrays;

public class ProblemNo1 {

    static int[] twoSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if ((num[i] + num[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int[] index = twoSum(numbers, 9);
        System.out.println(Arrays.toString(index));
    }
}