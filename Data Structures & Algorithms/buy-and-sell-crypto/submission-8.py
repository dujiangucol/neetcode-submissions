class Solution:
    def maxProfit(self, prices: List[int]) -> int:


        l,r = 0, 1
        max_prof = 0
        while r < len(prices):
            temp_prof = prices[r] - prices[l]
            max_prof = max(max_prof, temp_prof)
            if prices[r] < prices[l]:
                l = r
            
            r+=1
        
        return max_prof
