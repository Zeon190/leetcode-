class Solution {
public int minimumPushes(String word) {
    int freq[] = new int[26];
    for (int i = 0; i < word.length(); i++)
    {
        freq[word.charAt(i) - 'a']++;
    }

    Arrays.sort(freq);

    int pushes = 0;
    for (int i = 0; i < freq.length; i++) 
    {
        int fre = freq[25 - i];
        if (fre == 0)
        break;
        pushes += (i / 8 + 1) * fre;
    }

    return pushes;
    }
}