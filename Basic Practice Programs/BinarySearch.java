import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int middle = (start + end) / 2;
        while (!(start > end)) {
            if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
            middle = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 233, 112, 322, 112, 11, 321 };
        int index = binarySearch(nums, 3211);
        System.out.println(index);
    }
}
