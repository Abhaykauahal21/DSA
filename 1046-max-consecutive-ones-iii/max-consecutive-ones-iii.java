class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zerocount = 0;
        int maxlen = 0;
        int left = 0;

        for(int right = 0;right<n;right++){
            if(nums[right] == 0){
                zerocount++;
            }

            while(zerocount > k){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
        
    }
}