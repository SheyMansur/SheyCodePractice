class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> scannedChars = new HashSet<>();
        int max = 0;
        int len = 0;
        int i = 0;

        while (i < s.length()) {
            char currChar = s.charAt(i);
            if (scannedChars.contains(currChar)) {
                scannedChars.clear();
                max = Math.max(max, len);
                i -= len;
                len = 0;
            } else {
                scannedChars.add(currChar);
                len++;
            }
            i++;
        }
        return Math.max(max, len);
    }
}