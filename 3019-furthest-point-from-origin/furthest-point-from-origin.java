class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r = 0;
        int l = 0;
        int blank = 0;

        for(char c : moves.toCharArray()){
            if(c == 'R'){
                r++;
            } else if(c == 'L'){
                l++;
            } else {
                blank++;
            }
        }

        return Math.abs(r - l) + blank;
    }
}