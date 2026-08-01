class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0,low=0,high=nums.length-1;
        Arrays.sort(nums);
        while(low<high){
            int sum=nums[low]+nums[high];
            if(sum<k){
                low++;
            }else if(sum>k){
                high--;
            }else if(sum==k){
                low++;high--;count++;
            }
        }
            return count;
    }
}