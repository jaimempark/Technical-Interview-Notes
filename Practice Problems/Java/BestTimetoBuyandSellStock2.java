//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        int diff = 0;
        for (int i = 0; i < prices.length-1; i++){
            diff = prices[i+1] - prices[i];
            if(diff > 0){
                prof += diff;
            }
        }
        return prof;
    }
}