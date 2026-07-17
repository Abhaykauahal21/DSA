class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zerocount = 0;
        int maxone = 0;
        int left = 0;

        for(int right = 0;right<n;right++){
            if(nums[right]==0){
                zerocount++;
            }

            while(zerocount > k){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
            }

            maxone = Math.max(maxone, right-left+1);
        }
        return maxone;
        
    }
}