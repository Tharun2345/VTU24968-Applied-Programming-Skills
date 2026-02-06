class Solution {
    public int maxProfit(int[] prices) {

        // max stores the maximum profit we can achieve so far
        int max = 0;

        // min stores the minimum stock price encountered so far
        int min = prices[0];

        // Traverse through each day's price
        for (int price : prices) {

            // Update minimum price if we find a cheaper price
            min = Math.min(min, price);

            // Calculate profit if we sell at current price
            int profit = price - min;

            // Update max profit if this profit is better
            max = Math.max(max, profit);
        }

        // Return the maximum profit found
        return max;
    }
}