class Solution:

    def characterReplacement(self, s: str, k: int) -> int:

        res = 0
        l = 0
        dic = {}
        max_frequency = 0
        for r in range(len(s)):
            #loop through r
            dic[s[r]] = dic.get(s[r],0) +1
            max_frequency = max(max_frequency, dic[s[r]])

            while (r-l+1) - max_frequency > k:
                dic[s[l]] -=1
                l +=1

            res = max(res, (r-l+1))
        
        return res
           
