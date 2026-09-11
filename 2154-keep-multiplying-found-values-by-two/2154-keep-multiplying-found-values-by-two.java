class Solution {

    boolean find(int[] nums,int result){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==result){
                return true;
            }
        }
        return false;
    }

    public int findFinalValue(int[] nums, int original) {
        while(find(nums,original)){
            original*=2;
        }
        return original;
    }
}