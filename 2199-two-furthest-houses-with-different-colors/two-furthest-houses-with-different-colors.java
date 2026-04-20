class Solution {
        public int maxDistance(int[] colors) {
            int n = colors.length;
            int max = 0;
            int start = 0;

            for(int i=1;i<n;i++){
                if(colors[start] != colors[i]){
                    int dist = Math.abs(i-start);
                    max = Math.max(max, dist);
                }
            }

        for(int i=n-1; i>= 1;i--){
            if(colors[i] != colors[n-1]){
                int dist = Math.abs((n-1) - i);
                max = Math.max(max, dist);
            }
        }
        return max;

    }
}