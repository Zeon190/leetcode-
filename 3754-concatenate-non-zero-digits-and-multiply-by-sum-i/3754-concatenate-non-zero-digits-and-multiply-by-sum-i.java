class Solution {
    public long sumAndMultiply(int n) {
        int sum=0,digit,newnum=0,ans=0,di;
        while(n!=0){
            digit=n%10;
            if(digit!=0){
                sum+=digit;
                newnum=newnum*10+digit;
            }
            n=n/10;
        }

        while(newnum!=0){
            di=newnum%10;
            ans=ans*10+di;
            newnum=newnum/10;
        }
        return (long)ans*sum;
    }
}