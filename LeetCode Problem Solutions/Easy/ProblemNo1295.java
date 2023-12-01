package Easy;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class ProblemNo1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (Integer.toString(i).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 23, 34, 5, 222 };
        System.out.println(findNumbers(numbers));
    }
}