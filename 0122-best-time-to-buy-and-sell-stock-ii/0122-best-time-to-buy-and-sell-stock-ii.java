class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        long[][] dp = new long[n + 1][2];
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }
        dp[n][0] = dp[n][1] = 0;
        long profit = 0;
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 0) { 
                    profit = Math.max(0 + dp[ind + 1][0], -prices[ind] + dp[ind + 1][1]);
                }
                if (buy == 1) { 
                    profit = Math.max(0 + dp[ind + 1][1], prices[ind] + dp[ind + 1][0]);
                }

                dp[ind][buy] = profit;
            }
        }
        return (int)dp[0][0]; 
    }
}