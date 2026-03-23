class Solution {
    public int largestAltitude(int[] nums) {
        int n = nums.length;
        int max = 0;
        int curr = 0;

        for(int i=0;i<n;i++){
            curr += nums[i];
            max = Math.max(curr, max);
        }
        return max;
        
    }
}