class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int maxlen=0;
        int start=0;
        Map<Integer,Integer> frequency=new HashMap<>();

        for(int high=0;high<n;high++){
            frequency.put(fruits[high],frequency.getOrDefault(fruits[high],0)+1);
            while(frequency.size()>2){
                frequency.put(fruits[start],frequency.get(fruits[start])-1);
                if(frequency.get(fruits[start]) == 0 ){
                    frequency.remove(fruits[start]);
                    }
                    start++;
            }
            int len=high-start+1;
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}