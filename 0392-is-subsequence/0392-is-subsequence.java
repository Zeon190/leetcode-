class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int i=0,j=0;
        int n=s.length();
        int m=t.length();

        while(i<n && j<m ){
            if(s.charAt(i)==t.charAt(j)){
                count++;i++;
            }
            j++;
        }
        return (count==n);
    }
}