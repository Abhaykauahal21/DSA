class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] scount = new int[26];
        int[] pcount =  new int[26];

        List<Integer> ans = new ArrayList<>();

        for(char c : p.toCharArray()){  // pcount
            pcount[c - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            scount[s.charAt(i)-'a']++;

            if(i >= p.length()){
                scount[s.charAt(i-p.length())-'a']--;
            }

            if(Arrays.equals(pcount, scount)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
        
    }
}