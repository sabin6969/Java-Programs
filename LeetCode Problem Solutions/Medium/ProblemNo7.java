public class ProblemNo7 {
    static int reversed(int number) {
        long reversedNumber = 0;
        while (number != 0) {
            int unitDigit = number % 10;
            reversedNumber = reversedNumber * 10 + unitDigit;
            number = number / 10;
        }
        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversedNumber;
    }
}