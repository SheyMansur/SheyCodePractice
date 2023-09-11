class Solution {
    public int jump(int[] nums) {
        //Looked at solutions
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i] + i, nums[i - 1]);
        }
        int pos = 0;
        int jumps = 0;
        while (pos < nums.length - 1) {
            pos = nums[pos];
            jumps++;
        }
        return jumps;
    }
}