class Solution {
    public void rotate(int[] nums, int k) {
        // void reverseRange(int i, int j) {
        //     int temp = nums[i]
        //     while (j > i) {
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //         temp = nums[i];
        //         j--;
        //     }
        // }
        // int m = nums.length - 1;
        // reverseRange(0, m);
        // reverseRange(0, k - 1);
        // reverseRange(k, m);
        k = (k % nums.length);
        int i = 0;
        int j = nums.length - 1;
        if (j == 0) {
            return;
        }
        int temp;
        while (j > i) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            temp = nums[i];
            j--;
        }
        i = 0;
        j = k - 1;
        while (j > i) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = k;
        j = nums.length - 1;
        while (j > i) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }

    
}