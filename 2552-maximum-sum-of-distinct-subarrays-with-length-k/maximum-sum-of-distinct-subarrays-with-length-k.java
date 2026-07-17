class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        Set<Integer> set = new HashSet<>();
        long sum = 0;
        long maxsum = 0;

        for(int right = 0;right<n;right++){

            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }


            set.add(nums[right]);
            sum += nums[right];

            if(right - left +1 ==k){

                maxsum = Math.max(maxsum, sum);
                sum-=nums[left];
                set.remove(nums[left]);
                left++;

            }
        }
        return maxsum;
    }
}