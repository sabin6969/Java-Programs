import java.util.Arrays;

// Collection of multiple elements having same datatype

public class Array {
    public static void main(String[] args) {
        // Declaration of array
        // datatype[] refrenceVariable = new datatype[size];
        // or
        // datatype refrenceVariable[] = new datatype[size];
        // Array literal
        // datatype[] refrenceVariable = {values,values,};
        int[] arr = new int[2];
        int arr2[] = new int[3];
        int[] marks = { 12, 23, 4, 55 };
        System.out.println(Arrays.toString(marks));
        arr[0] = 12;
        arr2[0] = 11;
    }
}