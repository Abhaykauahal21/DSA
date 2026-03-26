class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int l : weights){
            left = Math.max(l, left);
            right += l;
        }
        while(left < right){
            int mid = left + (right - left)/2;
            int currweight = 0;
            int curday = 1;
            for(int p : weights){
                if(currweight + p > mid){
                    curday++;
                    currweight = 0;
                }
                currweight += p;
            }
            if(curday <= days){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }
}