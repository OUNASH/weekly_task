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
