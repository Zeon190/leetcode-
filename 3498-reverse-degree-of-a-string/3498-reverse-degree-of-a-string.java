class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int num=s.charAt(i)-'a';
            sum+=(26-num)*(i+1);
        }
        return sum;
    }
}