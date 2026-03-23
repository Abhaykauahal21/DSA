class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int n = nums.length;
        map.put(0,-1);

        for(int i=0;i<n;i++){
            sum += nums[i];
            int mod = sum % k;
            if(mod < 0){
                mod += sum;
            }
            if(map.containsKey(mod)){
                if(i - map.get(mod) >= 2) {
                    return true;
                }
            }else{
                map.put(mod,i);
            }
            
        }
        return false;
        
    }
}