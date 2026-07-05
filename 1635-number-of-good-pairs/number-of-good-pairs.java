class Solution {
    public int numIdenticalPairs(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // for(int i=0;i<n;i++){
        //     map.put(nums[i], getOrdefault(nums[i], 0)+1);
        // }

        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;

                }
            }
        }
        return  count;
        
    }
}