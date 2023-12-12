public class StringMethods {
    // String is the collection of multiple characters encolsed with double
    // quotation
    public static void main(String[] args) {
        String name = "Sabin";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.equalsIgnoreCase("SaBin"));
        System.out.println(name.equals("SabiN"));
        System.out.println(name.endsWith("S"));
        System.out.println(name.startsWith("S"));
        System.out.println(name.charAt(0));

        // we can use + operatior for string and character
        String str1 = "Sabin ";
        String str2 = "Poudel";
        System.out.println(str1 + str2);
        System.out.println(str1 + 'M');

    }
}
