public class Ambiguous {
    // Ambiguous means unclear

    // method which accepts Array of integer
    static void method(int... a) {

    }

    // method which accepts Array of String
    static void method(String... a) {

    }

    public static void main(String[] args) {
        // unclear
        method();

    }
}
