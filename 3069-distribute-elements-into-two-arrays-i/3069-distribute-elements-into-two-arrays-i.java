class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int [] arr1=new int[n];
        int [] arr2=new int[n];

        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int x=0,y=0;

        for(int i=2;i<n;i++){
            if(arr1[x]>arr2[y]){
                ++x;
                arr1[x]=nums[i];
            }
            else if(arr1[x]<arr2[y]){
                ++y;
                arr2[y]=nums[i];
            }
        }
        int [] result =new int [n];
        int a=0;
        while(arr1[a]>0){
            result[a]=arr1[a];
            a++;
        }
        int b=0;
        while(arr2[b]>0){
            result[a+b]=arr2[b];
            b++;
        }

        return result;
    }
}