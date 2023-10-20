class Solution {
    public int twoCitySchedCost(int[][] costs) {
        PriorityQueue<Integer> aDif = new PriorityQueue<>();
        PriorityQueue<Integer> bDif = new PriorityQueue<>();
        int n = costs.length / 2;
        int ret = 0;
        for (int[] cost : costs) {
            int d = cost[0] - cost[1];
            if (d < 0) {
                aDif.add(-d);
                ret += cost[0];
            } else {
                bDif.add(d);
                ret += cost[1];
            }
        }
        bDif = aDif.size() < bDif.size() ? bDif : aDif;
        while (bDif.size() != n) {
            ret += bDif.poll();
        }
        return ret;
    }
}