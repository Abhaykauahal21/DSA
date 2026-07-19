class Solution {
    public int[] decrypt(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];

        if (k == 0)
            return ans;

        int start, end;

        if (k > 0) {
            start = 1;
            end = k;
        } else {
            start = n + k;
            end = n - 1;
            k = -k;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += nums[i % n];
        }

        for (int i = 0; i < n; i++) {

            ans[i] = sum;

            sum -= nums[start % n];
            start++;

            end++;
            sum += nums[end % n];
        }

        return ans;
    }
}