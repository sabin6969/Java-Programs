import java.util.ArrayList;

public class SecondLargestBrutforce {

    static int secndLargestElement(ArrayList<Integer> array) {
        array.sort(null);
        int largest = array.get(array.size() - 1);
        int secondLargest = -1;
        System.out.println(array);
        for (int i = array.size() - 2; i >= 0; i--) {
            if (array.get(i) != largest) {
                secondLargest = array.get(i);
                break;
            }
        }
        return secondLargest;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(33);
        nums.add(11);
        nums.add(101);
        nums.add(12);
        nums.add(101);
        System.out.print(secndLargestElement(nums));

    }

}