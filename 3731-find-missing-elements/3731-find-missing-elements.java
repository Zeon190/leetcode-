class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        int []arr=new int[max-min+1];
        int i=0,j=0;
         List<Integer> result = new ArrayList<>();
        for(int n=min;n<=max;n++){
            arr[n-min]=n;
        }

                while (i < nums.length && j < arr.length) {

            if (nums[i] == arr[j]) {
                i++;
                j++;
            } 
            else if (nums[i] < arr[j]) {
                // Skip duplicate / already passed value
                i++;
            } 
            else {
                result.add(arr[j]);
                j++;
            }
        }


        return result;

    }
}