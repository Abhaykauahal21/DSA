class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        double maxsum = Integer.MIN_VALUE;

        for(int right = 0;right<nums.length;right++){
            sum += nums[right];

            if(right-left +1 == k){
                maxsum = Math.max(maxsum, sum);

                 sum -= nums[left];
                 left++;
            }

           
        
        }
        return maxsum/k;
        
    }
}