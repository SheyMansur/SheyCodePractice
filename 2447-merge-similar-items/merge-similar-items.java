class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] count = new int[1000];
        for (int i = 0; i < items1.length; i++) {
            count[items1[i][0] - 1] = items1[i][1];
        }
        for (int i = 0; i < items2.length; i++) {
            count[items2[i][0] - 1] += items2[i][1];
        }
        List<List<Integer>> ret = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            if (count[i] != 0) {
                List<Integer> entry = new LinkedList<Integer>();
                entry.add(i + 1);
                entry.add(count[i]);
                ret.add(entry);
            }
            
        }
        return ret;
    }
}