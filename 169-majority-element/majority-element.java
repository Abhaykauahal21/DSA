class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int men = 0;
        for(int num : nums){
            if(count == 0){
                men = num;
            }if(num==men){
                count++;
            }else{
                count--;
            }
        }
        return men;
    }
}