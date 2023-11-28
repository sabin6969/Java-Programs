// Instance block gets executed when a new object is created
// Generally it is used to initalize instance variables

class Demo {

    {
        System.out.println("This is instance block");
    }
}

public class InstanceBlock {
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo c = new Demo();
    }
}
