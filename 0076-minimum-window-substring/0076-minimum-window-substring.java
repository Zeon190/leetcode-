class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        String result = "";
        int []feq1 = new int[256];
        int []feq2 = new int[256];

        if(n < m){
            return result;
        }

        // using array as a hashmap
        for(int i = 0; i < m; i++){
            feq1[t.charAt(i)]++;
        }

        // sliding window concept
        int low = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;

        for(int high = 0; high < n; high++){

            feq2[s.charAt(high)]++;

            if(feq2[s.charAt(high)] <= feq1[s.charAt(high)]){
                count++;
            }

            while(count == m){

                int length = high - low + 1;

                if(length < minLength){
                    minLength = length;
                    result = s.substring(low, high + 1);
                }

                feq2[s.charAt(low)]--;

                if(feq2[s.charAt(low)] < feq1[s.charAt(low)]){
                    count--;
                }

                low++;
            }
        }

        return result;
    }
}