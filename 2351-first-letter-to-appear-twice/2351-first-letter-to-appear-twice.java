class Solution {
    public char repeatedCharacter(String s) {
         int[] counts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counts[ch - 'a']++;
            if (counts[ch - 'a'] == 2) {
                return ch;
            }
        }
        return ' ';
    }
}