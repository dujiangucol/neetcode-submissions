class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "":
            return ""

        countT = {}
        for char in t:
            countT[char] = countT.get(char,0)+1
        
        window_len = 0
        have = 0
        need = len(countT)
        res = [-1,-1]
        reslen = float("infinity")
        windowT = {}
        l = 0

        for r in range(len(s)):
            windowT[s[r]]= windowT.get(s[r],0)+1
            if s[r] in countT and windowT[s[r]] == countT[s[r]]:
                have+=1
            while have == need:
                if (r-l+1) < reslen:
                    res = [l,r]
                    reslen = r-l+1
                windowT[s[l]] -=1
                if s[l] in countT and windowT[s[l]] < countT[s[l]]:
                    have -= 1
                l+=1
        
        l,r = res
        return s[l:r+1] if reslen != float("infinity") else ""




