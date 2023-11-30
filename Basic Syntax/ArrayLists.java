import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // arraylist is dynamic
        ArrayList<Integer> marks = new ArrayList<Integer>();
        System.out.println(marks);
        // add method
        marks.add(12);
        marks.add(22);
        marks.add(91);
        System.out.println(marks);
        // remove method
        marks.remove(0);
        System.out.println(marks);
        // set method
        // replaces current element
        marks.set(1, 33);
        System.out.println(marks);
        // sort method
        marks.sort(null);
        System.out.println(marks);
        // element at index 0
        System.out.println(marks.get(0));
        // length of arraylist
        System.out.println(marks.size());
    }
}
