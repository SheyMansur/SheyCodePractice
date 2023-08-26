class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> h = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (h.containsKey(complement)) {
                return new int[]{h.get(complement), i};
            }
            h.put(nums[i], i);
        }
        return null;
    }
}