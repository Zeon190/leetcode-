class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int n=digits.length;
        int i=n-1;

        while(carry==1 && i>=0){
            if(digits[i]==9){
                digits[i]=0;
                i--;
            }
            else {
                digits[i]+=1;
                carry--;
                }

        }
        if(carry==1){
            int ans[]=new int[n+1];
            ans[0]=1;
            for(int j=1;j<n+1;j++){
                ans[j]=0;
            }
            return ans;
        } else return digits;
    }
}