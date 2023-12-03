import java.util.Arrays;
// https://leetcode.com/problems/build-array-from-permutation/

public class ProblemNo1920 {
    static int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = { 0, 2, 1, 5, 3, 4 };
        int[] ans = buildArray(array);
        System.out.println(Arrays.toString(ans));
    }
}
