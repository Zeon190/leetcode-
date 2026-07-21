class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int k=n-1;
        int i=0;

            while(i<=k){
                int mid=i+(k-i)/2;
                if(nums[mid]==target){
                    return true;
                }if(nums[i]==nums[mid] && nums[k]==nums[mid]){
                    i++;
                    k--;
                }

                    //left half is sorted 
                 else if (nums[i] <= nums[mid]) {
                if (nums[i] <= target && target < nums[mid]) {
                    k = mid - 1;
                } else {
                    i = mid + 1;
                }
            }

            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[k]) {
                    i = mid + 1;
                } else {
                    k = mid - 1;
                }
            }
        }


        return false;
    }
}