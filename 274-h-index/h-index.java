class Solution {
    public int hIndex(int[] citations) {
        int[] count = new int[1001];
        for (int i = 0; i < citations.length; i++) {
            count[citations[i]]++;
        }
        int acc = 0;
        for (int j = 1000; j >= 0; j--) {
            if (count[j] + acc >= j) {
                return j;
            }
            acc += count[j];
        }
        return 0;
    }
}