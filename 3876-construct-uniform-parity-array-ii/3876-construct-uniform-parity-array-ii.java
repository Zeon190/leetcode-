class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        int mineven=Integer.MAX_VALUE;
        int minodd = Integer.MAX_VALUE;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                mineven=Math.min(mineven,nums1[i]);
                even++;
            }else {
                odd++;
                minodd=Math.min(minodd,nums1[i]);
            }

        }
        if(even==nums1.length){
            return true;
        }else if(odd==nums1.length){
            return true;
        }else if(mineven>minodd){
            return true;
        }

        return false;
    }
}