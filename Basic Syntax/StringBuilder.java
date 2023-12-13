class SB {
    // Strings are immutable in java
    // StringBuilders are the class that allows String to be mutated
    // StringBuilders are used for effective manipulation of string without creating
    // new object
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println(sb.reverse());
        // mutable
        System.out.println(sb);
    }
}
