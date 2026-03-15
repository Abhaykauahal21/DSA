class Solution {
    public int hIndex(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            int h= n-i;
            if(nums[i] >= h){
                return h;
            }
        }
        return 0;
        
    }
}