// https://leetcode.com/problems/richest-customer-wealth/

class ProblemNo1692 {
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int cols = 0; cols < accounts[row].length; cols++) {
                sum += accounts[row][cols];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 2 },
        };
        System.out.println(maximumWealth(accounts));
    }
}