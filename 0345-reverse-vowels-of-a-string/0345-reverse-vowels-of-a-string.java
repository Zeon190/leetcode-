class Solution {
    public String reverseVowels(String s) {
        // Convert string to character array to allow modification
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = s.length() - 1;
        String vowels = "AEIOUaeiou";
        
        while (left < right) {
            while (left < right && !vowels.contains(String.valueOf(arr[left]))) {
                left++;
            }

            while (left < right && !vowels.contains(String.valueOf(arr[right]))) {
                right--;
            }

            // Swap characters in the array
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        // Convert the character array back to a String
        return new String(arr);
    }
}
