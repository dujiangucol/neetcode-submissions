class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        record = {}
        result = []
        for i in range(len(nums)):

            if nums[i] in record:
                result = [record[nums[i]],i]
                break
            else:
                difference = target - nums[i]
                record[difference] = i 
        return result
            
            
            
