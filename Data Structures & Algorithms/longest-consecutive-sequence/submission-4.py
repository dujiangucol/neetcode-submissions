class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        temp = set(nums)

        res = 0
        for i in nums:
            if i-1 not in temp:
                current = i
                length = 1
                while current + 1 in temp:
                    current+=1
                    length +=1
                res = max(length, res)
        
        return res