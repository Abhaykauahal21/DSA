class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for(int num : nums){
            left = Math.max(left, num);
            right += num;
        }

        while(left < right){
            int mid = left + (right - left)/2;
            // count splits
            int count = 1;  // el to count hoga hi
            int sum  = 0;
            for(int num : nums){
                sum += num;
                if(sum > mid){
                    count++;
                    sum = num;
                }
            }
            if(count <= k){
                right = mid;
            }else{
                left = mid + 1;
            }
            
        }
        return left;
        
    }
}