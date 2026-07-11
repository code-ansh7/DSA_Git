public class BestTimeToBuyAndSellStocks{
    public static void main(String args[]) {
        int[] arr = {7, 1, 5, 3, 6, 8, 4};

        int minimumPrice = arr[0];
        int maximumProfit = 0;

        int bestBuyDay  = 0;
        int bestSellDay = 0;
        int buyDay      = 0;

        for (int i = 1; i < arr.length; i++) {
             if(arr[i] < minimumPrice){
                minimumPrice = arr[i];
                buyDay = i;
             } else {
                int currentProfit = arr[i] - minimumPrice;
                if(currentProfit > maximumProfit){
                    maximumProfit = currentProfit;
                    bestBuyDay = buyDay;
                    bestSellDay = i;
                }
             }
        }
        System.out.println("Best Buy Day   : " + (bestBuyDay + 1));
        System.out.println("Best Sell Day  : " + (bestSellDay + 1));
        System.out.println("Maximum Profit : " + maximumProfit);
    }
}