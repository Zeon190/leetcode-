class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int k=0,end=0,n=nums.length-1;

        for(int i=0;i<n;i++){
            k=Math.max(k,i+nums[i]);
            if(i == end){
                end = k;
                jump++;
            }
        }
        return jump;
    }
}