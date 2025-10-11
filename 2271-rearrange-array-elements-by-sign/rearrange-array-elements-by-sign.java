class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        
        int p = 0, q = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos[p++] = nums[i];
            } else {
                neg[q++] = nums[i];
            }
        }

        int[] result = new int[n];
        int j = 0;

        // Merge alternately: positive first, then negative
        for (int i = 0; i < n / 2; i++) {
            result[j++] = pos[i];
            result[j++] = neg[i];
        }

        return result;
    }
}
