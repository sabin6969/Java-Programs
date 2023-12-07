import java.util.Arrays;

public class SecondLargestElement {
    static int brutForceApproach(int[] array) {
        // sorting O(n log n)
        // traversing O(n)
        int largest;
        Arrays.sort(array);
        largest = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] != largest) {
                return array[i];
            }
        }
        return Integer.MIN_VALUE;
    }

    static int optimalSolution(int[] array) {
        // requires two pass
        int largest, secondLargest;
        largest = secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    static int optimizedSolution(int[] array) {
        int largest, secondLargest;
        largest = secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = { 12, 22, 11, 21, };
        // int ans = brutForceApproach(array);
        // System.out.println(ans);
        int ans = optimizedSolution(array);
        System.out.println(ans);
    }
}
