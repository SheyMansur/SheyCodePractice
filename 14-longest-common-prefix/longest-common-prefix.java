class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int i = 1;
        while (i < strs.length) {
            int j = 0;
            while (j < prefix.length() && 
            j < strs[i].length() && 
            prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
            i++;
        }
        return prefix;
        
    }
}