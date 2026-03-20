class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] pcount = new int[26];
        int[] wcount = new int[26];
        int n = s.length();
        int k = p.length(); // window size


        for(char c : p.toCharArray()){
           pcount[c - 'a']++;
        }

        for(int i = 0; i<n;i++){

            //add
            wcount[s.charAt(i) - 'a']++;

            // remove
            if(i >= k){
                wcount[s.charAt(i-k) - 'a']--;
            }

            if(Arrays.equals(pcount, wcount)){
                ans.add(i-k+1);
            }
        }
        return ans;
        
    }
}