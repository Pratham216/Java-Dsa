public class BuySellStocks {
    public static int getprofit(int prices[]){

        int buyPrice =Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i =0; i<= prices.length-1; i++){
            if(buyPrice < prices[i]){
                int currentProfit = prices[i] - buyPrice;

                maxProfit = Math.max(maxProfit, currentProfit);
            }else{
                buyPrice = prices[i];
            }

        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(getprofit(prices));
    }
}
