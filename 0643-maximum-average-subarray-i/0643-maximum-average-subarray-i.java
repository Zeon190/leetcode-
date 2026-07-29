class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int high=k;
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        while(high<nums.length){
            sum+=nums[high]-nums[high-k];
            max=Math.max(max,sum);
            high++;
        }
        return (double)max/k;
    }
}