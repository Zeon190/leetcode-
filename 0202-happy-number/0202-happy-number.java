class Solution {
    public boolean isHappy(int n) {
        while(n>9){
        int sum=0; 
            while(n>0){
            int x=n%10;
            n=n/10;
            sum+=x*x;
            }
            n=sum;
        }
            return (n==1||n==7);
    } 
}