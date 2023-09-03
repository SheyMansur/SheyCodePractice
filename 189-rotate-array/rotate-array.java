class Solution {
    public void rotate(int[] nums, int k) {
        k = (k % nums.length);
        int m = nums.length - 1;
        reverseRange(0, m, nums);
        reverseRange(0, k - 1, nums);
        reverseRange(k, m, nums);
    }

    public void reverseRange(int i, int j, int[] nums) {
            while (j > i) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

    
}