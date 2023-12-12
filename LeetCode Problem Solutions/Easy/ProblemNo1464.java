// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
public class ProblemNo1464 {
    static int maxProduct(int[] nums) {
        // O(n^2)
        int maxProduct = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (((nums[i] - 1) * (nums[j] - 1) > maxProduct)) {
                    maxProduct = (nums[i] - 1) * (nums[j] - 1);
                }
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 2 };
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
}
