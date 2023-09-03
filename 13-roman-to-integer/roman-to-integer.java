class Solution {
    public int romanToInt(String s) {
        char prev = 'M';
        int total = 0;
        for (int i = 0 ; i < s.length(); i++) {
            char curr = s.charAt(i);
            switch (curr) {
                case 'M': total += 1000; if (prev == 'C') {total -= 200;} break;
                case 'D': total += 500; if (prev == 'C') {total -= 200;}break;
                case 'C': total += 100; if (prev == 'X') {total -= 20;} break;
                case 'L': total += 50; if (prev == 'X') {total -= 20;} break;
                case 'X': total += 10; if (prev == 'I') {total -= 2;} break;
                case 'V': total += 5; if (prev == 'I') {total -= 2;} break;
                case 'I': total += 1; break;
            }
            prev = curr;
        }
        return total;
    }
}