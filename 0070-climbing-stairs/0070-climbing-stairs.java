class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 4; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        return c;
    }
}