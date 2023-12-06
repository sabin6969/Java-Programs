public class OrthoAgnosticBinarySearch {

    static boolean isAscendingOrder(int[] array) {
        if (array[0] <= array[array.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    static int searchElement(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int middle = (start + end) / 2;
        while (!(start > end)) {
            if (isAscendingOrder(array)) {
                if (array[middle] > target) {
                    end = middle - 1;
                } else if (array[middle] < target) {
                    start = middle + 1;
                } else {
                    return middle;
                }
                middle = (start + end) / 2;
            } else {
                if (array[middle] < target) {
                    end = middle - 1;
                } else if (array[middle] > target) {
                    start = middle + 1;
                } else {
                    return middle;
                }
                middle = (start + end) / 2;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 88, 41, 55, 43, 21, 11 };
        int target = 88;
        int index = searchElement(nums, target);
        System.out.println(index);

    }
}
