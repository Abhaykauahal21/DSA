class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : prices){
            min = Math.min(min, price);
            int profit = price  - min;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
        
    }
}