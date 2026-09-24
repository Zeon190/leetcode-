class Solution {
    public int smallestIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int n=0;
            int temp=nums[i];
            while(temp>0){
                n+=temp%10;
                temp/=10;
            }
            if(n==i){
                return i;
            }
            
        }
        return -1;
    }
}