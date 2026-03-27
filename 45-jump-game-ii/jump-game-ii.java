class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        int currjump = 0;
        int jump = 0;

        for(int i = 0;i<n-1;i++){
            farthest = Math.max(farthest, i+nums[i]);
            if(i==currjump){
                jump++;
                currjump = farthest;
            }
        }
        return jump;
    }
}