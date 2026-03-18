class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int maxSum = 0;
        int count = 0;

        for(int i=0;i<k;i++){    // first window 
            sum += arr[i];
        }
        
        if(sum/k >= threshold){
            count++;
        }

        for(int i = k; i<n;i++){
            sum += arr[i];              // expend window
            sum -= arr[i-k];          // shrink window
            if(sum/k >= threshold){
            count++;
            }
        }
        return count;
        
    }
}