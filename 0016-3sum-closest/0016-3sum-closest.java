class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int result=Integer.MAX_VALUE-1;
        int closest=0;


        for(int i=0;i<n-2;i++){
            int left=i+1; int right=n-1;

            while(left<right){

                int sum=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(sum-target);
                if(diff<result){
                    result=diff;
                    closest=sum;
                }

                if(target==sum){
                    return sum;
                }else if(target>sum){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closest;
    }
}
