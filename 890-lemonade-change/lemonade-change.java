class Solution {
    // 5 
    // 10 --> 5
    // 20 --> 5, 5, 5 or 10, 5
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int bill: bills){
            switch (bill){
                case 5: fives++;
                        break;
                case 10: if (fives>0) fives--;
                         else {
                             System.gc();
                             return false;
                         }
                         tens++;
                         break;
                case 20: if (tens>0 && fives>0) {
                            tens--;
                            fives--;
                        }
                        else if(fives>2) fives-=3;
                        else{
                            System.gc();
                            return false;
                        }
            }
        }
        System.gc();
        return true;
    }
}