class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                n++;
            } else {
                n--;
                if (s.charAt(i - 1) == '(') {
                    score += Math.pow(2, n);
                }
            }
        }
        return score;
    }
}
