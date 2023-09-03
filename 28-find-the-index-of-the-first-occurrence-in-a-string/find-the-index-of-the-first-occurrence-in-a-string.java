class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0;
        int len = needle.length();
        while (j < haystack.length() - len + 1) {
            if (needle.equals(haystack.substring(j, j + len))) {
                return j;
            }
            j++;
        }
        return -1;
    }
}