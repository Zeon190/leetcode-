class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        if (n == 0) return false;
        
        int []feq=new int[101];
        for(int i=0;i<n;i++){
            feq[nums[i]]++;
        }
        if(feq[nums[(n - 1) / 2]]>1){
            return false;
        }
        else return true;
    }
}