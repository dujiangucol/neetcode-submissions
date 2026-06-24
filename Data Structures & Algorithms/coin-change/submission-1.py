class Solution:
#Definition of the dp array: When the target amount is i, at least dp[i] coins are needed to make up the amount.
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [amount+1] *(amount+1)

        dp[0] = 0

        for i in range(len(dp)):
            for coin in coins:
                if i - coin <0:
                    continue
                
                dp[i] = min(dp[i], 1+ dp[i-coin])
        if dp[amount] == amount + 1:
            return -1
        else:
            return dp[amount]