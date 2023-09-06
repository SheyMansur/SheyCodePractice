class Solution {
    public boolean canJump(int[] nums) {
        int min_req = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            System.out.println(nums[i]);
            System.out.println("min" + min_req);
            if (nums[i] < min_req) {
                min_req++;
            } else {
                min_req = 1;
            }
        }
        System.out.println(nums[0]);
        System.out.println("min" + min_req);
        return min_req <= nums[0];
    }
}