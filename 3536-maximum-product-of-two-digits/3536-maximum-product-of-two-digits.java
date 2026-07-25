class Solution {
    public int maxProduct(int n) {
        int product=1,i=0;
        int []arr=new int[10];
        while(n>0){
            int temp=n%10;
            arr[i]=temp;
            n=n/10;
            i++;
        }
        Arrays.sort(arr);
            product=arr[9]*arr[8];
        return product;
    }
}