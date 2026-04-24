class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r = 0;
        int l = 0;
        int blank = 0;
        int ans = 0;

        for(char c: moves.toCharArray()){
            if(c == 'R'){
                r++;
            }else if(c == 'L'){
                l++;
            }else if(c == '_'){
                blank++;
            }
        }
        int a = Math.abs((blank + r) - l);
        int b = Math.abs((blank + l) -r);

        if(a > b){
            return a;
        }else{
            return b;
        }
        
    }
}