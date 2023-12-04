// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class ProblemNo1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }
}