class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create max heap based on frequency
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        // Add all keys to heap
        pq.addAll(map.keySet());

        // Step 3: Extract top k elements
        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }

        return result;
    }
}