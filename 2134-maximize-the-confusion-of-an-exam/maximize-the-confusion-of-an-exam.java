class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(solve(answerKey, k, 'T'), solve(answerKey, k, 'F'));
        
    }

    private int solve(String s, int k, int target){
        int n = s.length();
        int count = 0;
        int maxlen = 0;
        int left = 0;

        for(int right = 0; right < n; right++){
            if(s.charAt(right) != target){
                count++;
            }

            while(count > k){
                if(s.charAt(left) != target){
                    count--;
                }
                left++;
            }

            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}