class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            int frontChar = Character.toLowerCase(s.charAt(i));
            int backChar = Character.toLowerCase(s.charAt(j));
            if (!(frontChar >= 'a' && frontChar <= 'z') && !(frontChar >= '0' & frontChar <= '9')) {
                i++;
            } else if (!(backChar >= 'a' && backChar <= 'z') && !(backChar >= '0' & backChar <= '9')) {
                j--;
            } else {
                if (frontChar != backChar) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
        
    }
}