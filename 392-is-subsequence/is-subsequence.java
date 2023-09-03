class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (j == t.length()) {
                return false;
            }
            while (t.charAt(j) != s.charAt(i)) {
                j++;
                if (j == t.length()) {
                    return false;
                }
            }
            j++;
            i++;
        }
        return true;
    }
}