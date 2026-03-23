class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            totalsum += nums[i];
        }

        int leftsum = 0;
        for(int i=0;i<n;i++){
            if(leftsum == totalsum - leftsum - nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
        
    }
}