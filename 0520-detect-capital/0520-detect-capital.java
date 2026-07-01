class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercasecount=0;
        int n=word.length();

        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                uppercasecount++;
            }
        }

        if(uppercasecount==0 || uppercasecount==n || uppercasecount==1 
        && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        else return false;
    }
}