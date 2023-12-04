import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimized {

    static int[] twoSum(int[] num, int target) {

        HashMap<Integer, Integer> dataStructure = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int a = num[i];
            int b = target - a;
            if (dataStructure.containsKey(b)) {
                return new int[] { dataStructure.get(b), i };
            } else {
                dataStructure.put(a, i);
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
