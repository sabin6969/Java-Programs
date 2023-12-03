public class SecondLargestElement {
    static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        int secondLargest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 13, 11, 44, 551, 11 };
        secondLargestElement(nums);
    }
}
