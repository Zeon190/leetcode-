class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int low=0,high=1;
        Arrays.sort(nums);
        while(high>low && high<n){
            if(nums[high]==nums[low]){
                return nums[high];
            }else {
                low++;
                high++;
            }
        }
        return 0;
    }
}