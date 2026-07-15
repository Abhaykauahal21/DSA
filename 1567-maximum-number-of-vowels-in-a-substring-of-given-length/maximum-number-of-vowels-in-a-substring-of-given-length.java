class Solution {
    public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);

    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int left = 0;
        int count = 0;
        int maxcount = 0;

        for(int right = 0;right<n;right++){
            if(isVowel(s.charAt(right))){
                count++;
            }
            if(right - left + 1 ==k){
                maxcount = Math.max(count, maxcount);

                if(isVowel(s.charAt(left))){
                    count--;
                }
                left++;
            }
            
        }
        return maxcount;
        
    }
}