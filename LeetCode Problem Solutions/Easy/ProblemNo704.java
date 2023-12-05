// https://leetcode.com/problems/binary-search/

public class ProblemNo704 {
    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = (start + end) / 2;
        while (!(start > end)) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 23, 33, 34, 56, 71, 101 };
        int ans = binarySearch(nums, 3301);
        System.out.println(ans);

    }
}
