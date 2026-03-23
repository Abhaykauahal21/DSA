class Solution {
    public int findMiddleIndex(int[] nums) {
        // ek solid formula use krenge left = total - left - nums[i];

        // totalsum find kro;
        int totalsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum += nums[i];
        }
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            if(leftsum == totalsum - leftsum - nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}