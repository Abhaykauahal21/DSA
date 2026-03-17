class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = -1;

            // Step 1: Find index of nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    idx = j;
                    break;
                }
            }

            // Step 2: Find next greater element
            ans[i] = -1; // default
            for (int j = idx + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break; // important!
                }
            }
        }

        return ans;
    }
}