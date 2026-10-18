class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                return word;
            }
        }
        return "";
    }
}