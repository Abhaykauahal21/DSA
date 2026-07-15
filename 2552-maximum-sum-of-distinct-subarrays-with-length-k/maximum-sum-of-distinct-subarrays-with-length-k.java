import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        long maxSum = 0;

        int left = 0;
        Set<Integer> set = new HashSet<>();

        for (int right = 0; right < n; right++) {

            // Duplicate remove karo
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Current element add karo
            set.add(nums[right]);
            sum += nums[right];

            // Window size k se badi ho to shrink karo
            while (right - left + 1 > k) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Window size exactly k ho to answer update karo
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}