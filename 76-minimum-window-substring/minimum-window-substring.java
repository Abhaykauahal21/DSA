class Solution {
    public String minWindow(String s, String t) {

        // STEP 1: t ka frequency map banao (shopping list)
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // STEP 2: variables initialize
        int left = 0;
        int have = 0;
        int need = map.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        HashMap<Character, Integer> window = new HashMap<>();

        // STEP 3: right pointer se traverse (expand window)
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            // STEP 4: window me add karo
            window.put(c, window.getOrDefault(c, 0) + 1);

            // STEP 5: check match (agar required character complete ho gaya)
            if(map.containsKey(c) && 
               window.get(c).intValue() == map.get(c).intValue()){
                have++;
            }

            // STEP 6: jab sab mil jaye (valid window)
            while(have == need){

                // STEP 7: answer update (minimum window track)
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                // STEP 8: shrink window (left move)
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                // STEP 9: agar important char kam ho gaya → break condition
                if(map.containsKey(leftChar) &&
                   window.get(leftChar) < map.get(leftChar)){
                    have--;
                }

                left++; // window shrink
            }
        }

        // STEP 10: result return
        return minLen == Integer.MAX_VALUE 
            ? "" 
            : s.substring(start, start + minLen);
    }
}