
/* 
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/
import java.util.ArrayList;
import java.util.List;

public class ProblemNo1431 {
    static List<Boolean> kidsWithHighestCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i : candies) {
            if ((i + extraCandies) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        System.out.println(kidsWithHighestCandies(candies, 3));
    }
}
