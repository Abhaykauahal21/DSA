class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int end = 0;
        int jump = 0;
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            farthest = Math.max(farthest, i + nums[i]);

            if( i == end){
                jump++;
                end = farthest;
            }
        }
        return jump;

       
        
    }
}