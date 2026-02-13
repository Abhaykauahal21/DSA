class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxR = 0;

        for(int i=0;i<n;i++){
            if(i > maxR){
                return false;
            }else{
                maxR = Math.max(maxR, i + nums[i]);
            }
        }
        return true;
        
    }
}