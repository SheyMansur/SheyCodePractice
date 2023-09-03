class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.equals("")) {
            return (s.equals(""));
        }
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
                System.out.println(i + "|" + j);
            }
            j++;
            System.out.println("pasta");
            i++;
        }
        return true;
    }
}