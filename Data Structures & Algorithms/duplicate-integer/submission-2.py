class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        aset = set()
        for i in range(len(nums)):
            if nums[i] in aset:
                return True 
            aset.add(nums[i])
        return False