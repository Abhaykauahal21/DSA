class Solution {
    public int hIndex(int[] nums) {
        int n = nums.length;
        int[] bucket = new int[n+1];

        for(int c : nums){
            if(c >= n){
                bucket[n]++;
            }else{
                bucket[c]++;
            }
        }
        int paper = 0;
        for(int h = n; h >= 0; h--){
            paper += bucket[h];
            if(paper >= h){
                return h;
            }
        }
        return 0;
        
    }
}