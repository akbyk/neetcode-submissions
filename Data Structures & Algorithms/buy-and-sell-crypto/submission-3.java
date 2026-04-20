class Solution {
    public int maxProfit(int[] prices) {
        int minimum = 100;
        int maximum = 0;
        int profit = 0;
        for (int i = 0; i<prices.length; i++ ) {
            if (prices[i] < minimum) {
                minimum = prices[i];
                maximum = 0;
                for (int k = i; k<prices.length; k++ ) {
                    if (prices[k] > maximum) {
                        maximum = prices[k];
                    }
                }
                if (profit < (maximum - minimum)) {
                    profit = (maximum - minimum);
                }
            }
        }
        return (profit);
    }
}
