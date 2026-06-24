class Solution {
    public int[] shuffle(int[] nums, int n) {
        int s=nums.length;
        int [] list1=new int [s];
        for (int i=0;i<n;i++){
            list1 [i*2]=nums[i];
        }

        for(int i=0;i<=n;i++){
            if(i%2!=0){
            list1 [i]=nums[n];
            n++;
            }
        }
        return list1;
    }
}