class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if(mid %2 == 1){   // kyuki pairs hamesa even jagah se milega 
                mid--;
            }
            if(nums[mid]==nums[mid+1]){ 
                left = mid + 2; //pairs of 2
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}