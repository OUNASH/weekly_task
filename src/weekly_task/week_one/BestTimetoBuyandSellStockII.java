/*
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
 */
        public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {

        int profit = 0 ;
        int k=1 ;
        for( int j= 0 ; j< prices.length ; j++){

            if( k< prices.length && prices[j] < prices[k]){
                profit = profit + prices[k]-prices[j];
            }
            k++;
        }

        return profit;

    }
}
