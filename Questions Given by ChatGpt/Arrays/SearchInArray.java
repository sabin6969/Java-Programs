public class SearchInArray {
    static int seachArray(int[] array, int target) {
        if (array == null) {
            return -1;
        } else if (array.length == 0) {
            return -1;
        } else {
            for (int i = 0; i <= array.length - 1; i++) {
                if (target == array[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 23, 23, 34, 121, 11, 201 };
        int targetNumber = 201;
        int index = seachArray(numbers, targetNumber);
        System.out.println(index);
    }
}
