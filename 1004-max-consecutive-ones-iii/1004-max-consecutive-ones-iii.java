class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,low=0;
        int n=nums.length;
        int []arr=new int[2];


        for(int high=0;high<n;high++){
            arr[nums[high]]++;
            
            while(arr[0] > k){
                 arr[nums[low]]--;
                low++;
            }
            max=Math.max(max,high-low+1);
        }
        return max;
    }
}