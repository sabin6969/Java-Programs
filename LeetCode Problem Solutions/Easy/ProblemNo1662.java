package Easy;

public class ProblemNo1662 {
    public static boolean arrayStringAreEqual(String[] word1, String[] word2) {
        if (word1.length == 0 || word1.length == 0)
            return false;
        return String.join("", word1).equals(String.join("", word2));
    }

    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        System.out.println(arrayStringAreEqual(word1, word2));
    }
}
