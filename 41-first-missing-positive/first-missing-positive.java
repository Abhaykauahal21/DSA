class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // [3,4,-1,1]
        for(int i = 0; i < n; i++) {

            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                //swap
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        // agar sahi index pr nhi h to vahi number rsturn
        for(int i = 0; i < n; i++) {
            if(nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; // iff all correct retun exta number
    }
}