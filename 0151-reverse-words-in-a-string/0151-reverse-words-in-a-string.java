class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        int i=0;
        List<String> names = new ArrayList<>();

        while (i < n) {

            // Skip spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            // Extract a word
            String character = "";

            while (i < n && s.charAt(i) != ' ') {
                character += s.charAt(i);
                i++;
            }
              if (!character.isEmpty()) {
                names.add(character);
            }
        }
        Collections.reverse(names);
        String result = String.join(" ", names);

        return result;
    }
}