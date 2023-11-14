//Functions are the reuable block of code which is used to perform the specific task.
//Functions allows the code reusablity 
// DRY Donot repeat yourself
public class Functions {

    // static is a keyword that means independent of object
    // int is the return type of a function
    // add is a the name of the function
    // int a and int b are the parameter required by this function
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(12, 123);
        System.out.println("Sum is " + result);
    }
}
