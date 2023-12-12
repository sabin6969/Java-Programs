public class StringComparision {
    public static void main(String[] args) {
        // We can compare strings in java in two ways
        // == operator (checks for refrence)
        String a = "Sabin";
        String b = "Sabin";
        // internally in string pool a and b are pointing towards same object
        // so == will return true
        System.out.println(a == b);

        // .equals() is a method
        // it checks for value
        String naam = new String("Sabin");
        String name = new String("Sabin");
        // internally
        // naam and name are pointing to different objects
        System.out.println(name == naam); // false
        System.out.println(name.equals(naam));
    }
}
