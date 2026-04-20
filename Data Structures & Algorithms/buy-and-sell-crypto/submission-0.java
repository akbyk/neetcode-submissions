class Solution {
    public int maxProfit(int[] prices) {
        int minOnLeft = prices[0];
        int maxProfit = 0;
       for(int i = 0; i<prices.length; i++){
        if(maxProfit<prices[i]-minOnLeft){
            maxProfit = prices[i] - minOnLeft;
        }
        if(prices[i]<minOnLeft){
            minOnLeft = prices[i];
        }
       }
       // (condition) ? expressionTrue :  expressionFalse;
       return (maxProfit>0) ? maxProfit : 0;
    }
}
