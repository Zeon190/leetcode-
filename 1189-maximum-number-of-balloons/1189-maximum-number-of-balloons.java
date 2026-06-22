class Solution {
    public int maxNumberOfBalloons(String text) {
        int n=text.length();
        int [] feq=new int [26];
        for(int i=0;i<n;i++){
            feq[text.charAt(i)-'a']++;
        }

       return Math.min(
                Math.min(feq['b' - 'a'], feq['a' - 'a']),
                Math.min(
                        Math.min(feq['l' - 'a'] / 2, feq['o' - 'a'] / 2),
                        feq['n' - 'a']
                )
        );
    }
}