class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int k=flowerbed.length;
        if (k == 1) {
            if (flowerbed[0] == 0) count++;
            return count >= n;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0){
            count++;
            flowerbed[0]=1;
        }
        if(flowerbed[k-1]==0 && flowerbed[k-2]==0){
            count++;
            flowerbed[k-1]=1;
        }
        for(int i=1;i<k-1;i++){
            if(flowerbed[i]==1 ) continue;

            else if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            }
        }
        return count>=n;
    }
}