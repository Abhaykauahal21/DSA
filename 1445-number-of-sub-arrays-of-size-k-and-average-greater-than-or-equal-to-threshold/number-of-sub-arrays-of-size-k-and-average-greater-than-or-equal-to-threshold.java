class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;

        for(int i=0;i<k;i++){
            sum += arr[i];  // first window
        }

        if(sum / k >= threshold){
            count++;
        }

        for(int i=k;i< arr.length;i++){
            sum += arr[i];  // ek add kro 
            sum -= arr[i-k];  // ek minus kro 
            if(sum/k >= threshold){
                count++;
            }
        }

        
        return count;
        
    }
}