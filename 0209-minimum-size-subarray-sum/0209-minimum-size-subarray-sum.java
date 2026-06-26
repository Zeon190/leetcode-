class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int high=0,low=0,sum=0;
        int len=0,min=Integer.MAX_VALUE;

        while(high<n){
            sum+=nums[high];
            while(sum>=target){
                len=high-low+1;
                min=Math.min(min,len);
                sum-=nums[low];
                low++;
            }
            high++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }else 
        return min;
    }
}