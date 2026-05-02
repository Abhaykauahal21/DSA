import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }

        map.get(0).add(0);

        for (int stone : stones) {
            for (int jump : map.get(stone)) {
                for (int next = jump - 1; next <= jump + 1; next++) {

                    if (next > 0 && map.containsKey(stone + next)) {
                        map.get(stone + next).add(next);
                    }
                }
            }
        }

        return !map.get(stones[stones.length - 1]).isEmpty();
    }
}