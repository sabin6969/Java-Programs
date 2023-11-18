// Static block is a special block which gets executed when a class is loaded into jvm
// static block is executed only once through out the program life cycle
// it is used to perform one time operations like
// resource allocation, database connection

// Order of execution
// static block, instance block, Constructor

class Demo {
    static {
        System.out.println("This is static block");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        try {
            // class is being loaded
            Class.forName("Demo");
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
