class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        map.put(0,1);
        int sum =0;
        int count = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            int mod = sum % k; // some ka mode nikalo kya voh divisible hai 
            if(mod < 0){    // handle negative mode
                mod += k;
            }
            if(map.containsKey(mod)){
                count += map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod,0)+1);  // mode ko put krdo hashmap mai
        }
        return count;
        
    }
}