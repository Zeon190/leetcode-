class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int low=0;
        int high=0;
        int count=0,max=0;

        String ch="aeiou";
        while(high<k){
            if (ch.contains(String.valueOf(s.charAt(high)))){
                count++;

            }
            high++;
        }
        max=count;

        while(high <n){

            if (ch.contains(String.valueOf(s.charAt(low)))){
                count--;
            }

            if (ch.contains(String.valueOf(s.charAt(high)))){
                count++;
            }

            high++;
            low++;
            max=Math.max(max,count);


        }
        return max;
    }
}