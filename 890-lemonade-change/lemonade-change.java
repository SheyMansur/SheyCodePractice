class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveBills = 0;
        int tenBills = 0;
        for (int bill: bills) {
            if (fiveBills < 0) return false;
            if (bill == 5) {
                fiveBills++;
            } else if (bill == 10) {
                fiveBills--;
                tenBills++;
            } else {
                // bill == 20
                if (tenBills > 0) {
                    tenBills--;
                    fiveBills -= 1;
                } else {
                    fiveBills -= 3;
                }
                
            }
        }
        return fiveBills >= 0;
        
    }
}