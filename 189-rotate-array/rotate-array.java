class Solution {
    // public void rotate(int[] nums, int k) {
    //     k = (k % nums.length);
    //     int m = nums.length - 1;
    //     reverseRange(0, m, nums);
    //     reverseRange(0, k - 1, nums);
    //     reverseRange(k, m, nums);
    // }

    // public void reverseRange(int ind, int j, int[] num) {
    //     for (int i = ind; i < ((j - ind)/ 2) + ind; i++) {
    //         int temp = num[i];
    //         num[i] = num[j];
    //         num[j] = temp;
    //         j--;
    //     }
    // }

        public static int[] reverse (int []num ,int start , int end)
    {
        int j = end-1;
        System.out.println(start);
        
        for (int i = start ; i <((end-start+1)/2)+start; i++)
        {
            int temp = num[i];
            num[i]= num[j];
            num[j]=temp;
            j--;
        }
        System.out.println (Arrays.toString(num));
        return num;
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        nums=reverse(nums, 0, nums.length);
        nums= reverse(nums,0, k);
        nums= reverse(nums,k,nums.length);
    }

    

    
}