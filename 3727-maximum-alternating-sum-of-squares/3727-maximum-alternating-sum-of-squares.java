class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int a=0;a<nums.length;a++){
            nums[a]=nums[a]*nums[a];
        }
        Arrays.sort(nums);
        long total=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            total=total+nums[j]-nums[i];
            i++;
            j--;
        }
        if (i == j) {
            total += nums[i];
        }

        return total;
    }
}