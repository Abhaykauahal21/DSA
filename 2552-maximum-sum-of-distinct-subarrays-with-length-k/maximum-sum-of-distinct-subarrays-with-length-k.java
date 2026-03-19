class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum = 0;   // long m lena pdega 
        long maxSum = 0;
        int right = 0;
        int left= 0;

        for(right = 0;right< nums.length;right++){
            // kya duplicate hai to left ko hatao
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            // current ko add krdo sum mai
            set.add(nums[right]);
            sum += nums[right];

            // window size agar k ke barabr hai to maxSum m sum update kro or left wale ko hata do 
            if(right - left + 1 == k){
                maxSum = Math.max(maxSum, sum);
                
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

        }
        return maxSum;
        
    }
}