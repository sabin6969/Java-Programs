//HelloWorld is the name of class
class HelloWorld {
    // public is an access specifier which means this method can be accessed from
    // anywhere
    // static means there is nothing to do with object
    // void is the return type of this function which means nothing
    // main is a top level function from where execution of program begins
    public static void main(String[] args) {
        // System is a class
        // out is a variable in the System class
        // print, println, printf are the methods inside System class
        System.out.println("Hello World 1");
        // println will print new line
        System.out.printf("Hello World 2");
        // printf is used for string formating and printf does not prints new line
        System.out.print("Hello World 3");
        // print does not prints new line
    }
}