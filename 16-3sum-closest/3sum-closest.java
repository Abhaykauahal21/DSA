class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closediff = Integer.MAX_VALUE;
        int closesum = 0;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){

            int left = i+1;
            int right = n-1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];
                
                int diff = Math.abs(sum -target);
                if(diff < closediff){
                    closediff = diff;
                    closesum = sum;
                }
                if(sum == target){
                    return target;
                }
                else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closesum;
       
    }   

        


}