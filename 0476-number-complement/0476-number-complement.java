class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;

        int n = Integer.toBinaryString(num).length();      // converting to binary and then finding length
        
        int k = (1 << n) - 1; //to get n number of 1's 
        
        return num ^ k;
    }
}