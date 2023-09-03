class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int index = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                int curr = count.get(nums[i]) + 1;
                if (curr > max) {
                    max = curr;
                    index = i;
                }
                count.put(nums[i], curr);
            } else {
                count.put(nums[i], 1);
            }
        }
        for (int key : count.keySet()) {
            System.out.println(key + "|" + count.get(key));
        }
        return nums[index];
    }
}