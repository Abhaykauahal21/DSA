class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int num : time){
            int rem = num % 60;
            int need = (60 - rem) % 60;
            if(map.containsKey(need)){
                count+= map.get(need);
            }

            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return count;
        
    }
}