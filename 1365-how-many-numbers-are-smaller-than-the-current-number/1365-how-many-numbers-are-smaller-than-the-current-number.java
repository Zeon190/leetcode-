class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0,n;
        n=nums.length;
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }result[i]=count;
            }
        }
        return result;
    }
}