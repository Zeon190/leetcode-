class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0,min=Integer.MAX_VALUE,low=0;

        for(int high=0;high<n;high++){
            sum+=nums[high];
            while(sum>=target){
                int length=high-low+1;
                min=Math.min(min,length);
                sum-=nums[low];
                low++;
            }
        }if(min==Integer.MAX_VALUE){
            return 0;
        }else return min;
    }
}