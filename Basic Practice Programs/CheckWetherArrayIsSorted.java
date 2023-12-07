// an array is given we have to check whether that array is sorted strictly in ascending order
public class CheckWetherArrayIsSorted {
    // for an array to be sorted in ascending order its nth element must be smaller
    // or equals to nth+1 element

    static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (!(array[i] >= array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 1 };
        System.out.println(isSorted(array));
    }
}
