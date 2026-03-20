class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int ans = 0;
        int n = s.length();
        int[] count = new int[3];

        for(int right = 0; right < n; right++){

            //add in count
            count[s.charAt(right) - 'a']++;
            
            // agr abc teeno hai to ans mai add krdo
            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                ans += (n - right);

                // piche ke element ko hatao
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
     
    }
}