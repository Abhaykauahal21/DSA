class Solution {
    public int minDays(int[] nums, int m, int k) {
        if((long)m * k > nums.length){
            return -1;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for(int b : nums){
            left = Math.min(left, b);
            right = Math.max(right, b);
        }

        while(left < right){
            int mid = left + (right - left)/2;
            int count = 0;
            int bouq = 0;

            for(int b : nums){
                if(b <= mid){
                    count++;
                    if(count == k){
                        bouq++;
                        count = 0;
                    }
                }
                else{
                    count = 0;
                }
            }
            if(bouq >= m){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }
}