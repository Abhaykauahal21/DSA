class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;
        int right = n-1;

        while(left < right){
            sum = nums[left] + nums[right];
            maxsum = Math.max(maxsum, sum);
            left++;
            right--;
        }
        return maxsum;
        
    }
}