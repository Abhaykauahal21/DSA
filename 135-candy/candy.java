class Solution {
    public int candy(int[] nums) {
        int n = nums.length;
        int[] candies = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++){
            candies[i] = 1;
        }

        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(nums[i] > nums[i+1]){
                candies[i] = Math.max(candies[i],  candies[i+1] + 1);
            }
        }

        for(int c : candies){
            sum += c;
        }
        return sum;
        
    }
}