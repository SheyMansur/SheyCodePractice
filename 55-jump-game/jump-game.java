class Solution {
    public boolean canJump(int[] nums) {
        int min_req = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < min_req) {
                min_req++;
            } else {
                min_req = 1;
            }
        }
        return min_req <= nums[0];
    }
}