class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        int sum = 0;
        //sabko ek ek candy dedo
        for(int i=0;i<n;i++){
            candies[i] = 1;
        }
        // left se check kro neibour or value bhada do
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }
        // right se check kro or value bhada do
        for(int i = n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
        }
        // sum krdo canies ka 
        for(int i=0;i<n;i++){
            sum += candies[i];
        }
        return sum;

        
    }
}