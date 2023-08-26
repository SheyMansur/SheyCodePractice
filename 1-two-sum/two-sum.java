class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (h.containsKey(complement)) {
                System.gc();
                return new int[]{h.get(complement), i};
            }
            h.put(nums[i], i);
        }
        return null;
    }
}