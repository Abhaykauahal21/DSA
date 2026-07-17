import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        // Count characters in s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Subtract characters from t
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);

            if (map.get(ch) < 0) {
                return ch;
            }
        }

        return ' ';
    }
}