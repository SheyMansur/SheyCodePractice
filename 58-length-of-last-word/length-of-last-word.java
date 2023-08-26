class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        boolean wordFound = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currChar = s.charAt(i);
            if (wordFound && currChar != ' ') {
                lastWordLength++;
            }
            else if (wordFound && currChar == ' ') {
                return lastWordLength;
            }
            else if (currChar != ' ') {
                wordFound = true;
                lastWordLength++;
            }
        }
        return lastWordLength;
    }
}