class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int sublen = 0;
        Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            first.putIfAbsent(nums[i], i);
            if (count.get(nums[i]) > degree) {
                degree = count.get(nums[i]);
                sublen = i - first.get(nums[i]) + 1;
            } else if (count.get(nums[i]) == degree) {
                sublen = Math.min(sublen, i - first.get(nums[i]) + 1);
            }
        }
        return sublen;
    }
}